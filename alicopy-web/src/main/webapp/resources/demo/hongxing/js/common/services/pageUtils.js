(function(){var t,n;t=[],n=function(){var pageUtils,t;return t=function(t){return-1===t.indexOf("://")?chrome.runtime.getURL(t):t},pageUtils=function(){return this.makeQueryString=function(t){var n,r;return"?"+function(){var e;e=[];for(n in t)r=t[n],e.push(""+n+"="+r);return e}().join("&")},this.openUrl=function(n,r){return n=t(n),chrome.tabs.getSelected(null,function(){return function(t){return chrome.tabs.create({url:n,index:t.index+1}),"function"==typeof r?r():void 0}}(this))},this.activateUrl=function(n,r){var e;return n=t(n),e=n.split("#")[0],chrome.tabs.query({url:e+"*"},function(t){return t&&t.length>0?void chrome.tabs.update(t[0].id,{url:n,highlighted:!0},function(){return"function"==typeof r?r():void 0}):chrome.tabs.getSelected(null,function(t){return chrome.tabs.create({url:n,index:t.index+1},function(){return"function"==typeof r?r():void 0})})})},this.closeUrl=function(n){return n=t(n),chrome.tabs.query({url:n+"*"},function(){return function(t){var n;return chrome.tabs.remove(function(){var r,e,u;for(u=[],r=0,e=t.length;e>r;r++)n=t[r],u.push(n.id);return u}())}}(this))},this.redirectUrl=function(n){return location.href=t(n)},this.reloadCurrentTab=function(t){return chrome.tabs.query({active:!0,currentWindow:!0},function(n){var r,e,u,i;for(i=[],e=0,u=n.length;u>e;e++)r=n[e],i.push(chrome.tabs.update(r.id,{url:r.url},function(){return"function"==typeof t?t():void 0}));return i})},window.pageUtils=this,this}},define(t,n)}).call(this);