<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8"><title>个人资料</title><meta name="apple-mobile-web-app-capable" content="yes"><meta name="apple-mobile-web-app-status-bar-style" content="black"><meta name="format-detection" content="telephone=no"><meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=0.5, maximum-scale=2.0, user-scalable=yes" /><link href="./tpl/Wap/default/common/css/userinfo/fans.css" rel="stylesheet" type="text/css">
<!-- <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>  -->
<script type="text/javascript" src="/tpl/User/default/common/js/select/js/jquery.js"></script>
<script type="text/javascript">
window.jQuery || document.write('<script type="text/javascript" src="./tpl/Wap/default/common/css/guajiang/js/jquery.js">\x3C/script>')
</script>
<script src="/tpl/static/artDialog/jquery.artDialog.js?skin=default"></script>
<script src="/tpl/static/artDialog/plugins/iframeTools.js"></script>
<script src="/tpl/static/upyun.js?2013"></script>
<style>.footFix{
	width:100%;text-align:center;position:fixed;left:0;bottom:0;z-index:99;
}
#footReturn a, #footReturn2 a {
display: block;
line-height: 41px;
color: #fff;
text-shadow: 1px 1px #282828;
font-size: 14px;
font-weight: bold;
}
#footReturn, #footReturn2 {
z-index: 89;
display: inline-block;
text-align: center;
text-decoration: none;
vertical-align: middle;
cursor: pointer;
width: 100%;
outline: 0 none;
overflow: visible;
Unknown property name.-moz-box-sizing: border-box;
box-sizing: border-box;
padding: 0;
height: 41px;
opacity: .95;
border-top: 1px solid #181818;
box-shadow: inset 0 1px 2px #b6b6b6;
background-color: #515151;
Invalid property value.background-image: -ms-linear-gradient(top,#838383,#202020);
background-image: -webkit-linear-gradient(top,#838383,#202020);
Invalid property value.background-image: -moz-linear-gradient(top,#838383,#202020);
Invalid property value.background-image: -o-linear-gradient(top,#838383,#202020);
background-image: -webkit-gradient(linear,0% 0,0% 100%,from(#838383),to(#202020));
Invalid property value.filter: progid:DXImageTransform.Microsoft.gradient(GradientType=0,startColorstr='#838383',endColorstr='#202020');
Unknown property name.-ms-filter: progid:DXImageTransform.Microsoft.gradient(GradientType=0,startColorstr='#838383',endColorstr='#202020');
}
</style></head><body id="fans" ><div class="qiandaobanner"><img src="tpl/Wap/default/common/images/userinfo/fans.jpg" ></div><div class="cardexplain"><li class="nob"><div class="beizhu">请先完善您的个人信息，红色为必填项</div></li><ul class="round"><li><table width="100%" border="0" cellspacing="0" cellpadding="0" class="kuang"><tr><th><font color='red'>微信昵称</font></th><td><input name="wechaname" onfocus="check2(this)"
onblur="check1(this)"  type="text" class="px" id="wechaname" value="" placeholder="请输入您的微信名称"></td></tr></table></li><li><table width="100%" border="0" cellspacing="0" cellpadding="0" class="kuang"><tr><th><font color='red'>手机号码</font></th><td><input onfocus="check2(this)"
onblur="check3(this)" name="tel"  class="px" id="tel" value=""  type="text" placeholder="请输入您的电话"></td></tr></table></li><li><table width="100%" border="0" cellspacing="0" cellpadding="0" class="kuang"><tr><th>真实姓名</th><td><input name="truename"  type="text" class="px" id="truename" value="" placeholder="请输入您的真实姓名"></td></tr></table></li><li><table width="100%" border="0" cellspacing="0" cellpadding="0" class="kuang"><tr><th>QQ号码</th><td><input name="qq"  class="px" id="qq" value=""  type="text" placeholder="请输入您的QQ号码"></td></tr></table></li></ul><ul class="round"><li><style>.por{width:65px;float:left;height:65px;}
.por img{width:60px;height:60px;cursor:pointer}
.por img.selected{border:2px solid #f60}
</style><script>function selectpor(el){
	$("#portrait").val(el.src);
	$('#pors img').removeClass('selected');
	$('#portrait_src').attr('src',el.src);
	el.className='selected';
}
</script><div style="padding:10px 10px 10px 0;">请设置头像</div><input type="hidden" value="" id="portrait" name="portrait" size="80" /><a href="###" onclick="upyunWapPicUpload('portrait',200,200,'occcgv1404262269')" class="a_upload" style="color:red">点击这里上传</a><div class="por"><img src="/tpl/User/default/common/images/portrait.jpg" id="portrait_src" /></div><div style="clear:both"></div>或者选择下面头像
<div style="margin:10px 0 20px 0" id="pors"><div class="por"><img onclick="selectpor(this)" src="/tpl/static/portrait/1.jpg" /></div><div class="por"><img onclick="selectpor(this)" src="/tpl/static/portrait/2.jpg" /></div><div class="por"><img onclick="selectpor(this)" src="/tpl/static/portrait/3.jpg" /></div><div class="por"><img onclick="selectpor(this)" src="/tpl/static/portrait/4.jpg" /></div><div class="por"><img onclick="selectpor(this)" src="/tpl/static/portrait/5.jpg" /></div><div class="por"><img onclick="selectpor(this)" src="/tpl/static/portrait/6.jpg" /></div><div class="por"><img onclick="selectpor(this)" src="/tpl/static/portrait/7.jpg" /></div><div class="por"><img onclick="selectpor(this)" src="/tpl/static/portrait/8.jpg" /></div><div class="por"><img onclick="selectpor(this)" src="/tpl/static/portrait/9.jpg" /></div><div class="por"><img onclick="selectpor(this)" src="/tpl/static/portrait/10.jpg" /></div><div style="clear:both"></div></div></li></ul><ul class="round"><li><table width="100%" border="0" cellspacing="0" cellpadding="0" class="kuang"><tr><th>性别</th><td><select name="sex" class="dropdown-select" id="sex"><option  class="dropdown-option">请选择你的性别</option><option  value="1" >男</option><option  value="2" > 女</option><option  value="3" >其他</option></select></td></tr></table></li><li><table width="100%" border="0" cellspacing="0" cellpadding="0" class="kuang"><tr><th>出生年</th><td><input name="bornyear"  type="text" class="px" id="bornyear" value="" placeholder="请输入出生年份"></td></tr></table></li><li><table width="100%" border="0" cellspacing="0" cellpadding="0" class="kuang"><tr><th>出生月</th><td><input name="bornmonth"  type="text" class="px" id="bornmonth" value="" placeholder="请输入出生月份"></td></tr></table></li><li><table width="100%" border="0" cellspacing="0" cellpadding="0" class="kuang"><tr><th>出生日</th><td><input name="bornday"  type="text" class="px" id="bornday" value="" placeholder="请输入出生日"></td></tr></table></li></ul><div class="footReturn"><a id="showcard"  class="submit" >提交信息</a><div class="window" id="windowcenter" ><div id="title" class="wtitle"><span class="close" id="alertclose"></span></div><div class="content"><div id="txt"></div></div></div></div><div style="height:60px;" id="msg">&nbsp;</div><script type="text/javascript">$("#showcard").bind("click",
function() {
    var btn = $(this);
    var wechaname = $("#wechaname").val();
	var tel 	  = $("#tel").val();
	var truename  = $("#truename").val();
	var qq 		  = $("#qq").val();
	var sex 	  = $("#sex").val();
	var birthday  = $("#birthday").val();	
	var address   = $("#address").val();
	var info  	  = $("#info").val();
	var bornyear       = $("#bornyear").val();
	var bornmonth       = $("#bornmonth").val();
	var bornday       = $("#bornday").val();
	var portrait       = $("#portrait").val();
	var paypass       = $("#paypass").val();
	
    if (tel == '') {
        alert("请认真输入手机号");
        return
    }
    
    if (wechaname == '') {
        alert("请认真输入微信号");
        return
    }
    if(/[^\d]/.test(bornyear)||bornyear>2013||bornyear<1914){
    	alert("请认真输入出生年份");
        return
    }
    if(/[^\d]/.test(bornmonth)||bornmonth<1||bornmonth>12){
    	alert("请认真输入出生月份"+bornmonth);
        return
    }
    if(/[^\d]/.test(bornday)||bornday<1||bornday>31){
    	alert("请认真输入出生日");
        return
    }
   if(paypass != '' && paypass != undefined){
    var submitData = {
        wechaname : wechaname,
        tel 	  : tel,
        truename  : truename,
        qq        : qq,
        sex 	  : sex,
        birthday  : birthday,
        address   : address,
        info 	  : info,
        bornyear  : bornyear,
        bornmonth : bornmonth,
        bornday   : bornday,
        cardid 	  : 0,
        portrait  : portrait,
		paypass  : paypass,
        action: "index"
    };
   }else{
  
    var submitData = {
        wechaname : wechaname,
        tel 	  : tel,
        truename  : truename,
        qq        : qq,
        sex 	  : sex,
        birthday  : birthday,
        address   : address,
        info 	  : info,
        bornyear  : bornyear,
        bornmonth : bornmonth,
        bornday   : bornday,
        cardid 	  : 0,
        portrait  : portrait,
        action: "index"
    };
	
	 }
	
    $.post('index.php?g=Wap&m=Userinfo&a=index&token=occcgv1404262269&wecha_id=oqmEBjybcKqjL-XVKsLRhuHImfko&cardid=', submitData,
    function(data) {
        if(data==1){			 
			alert('个人信息保存成功');
			location.href = "/index.php?g=Wap&m=Wall&a=person&token=occcgv1404262269&wecha_id=oqmEBjybcKqjL-XVKsLRhuHImfko&id=5890";		}else if(data==2){
			alert('成功领取了会员卡');
			location.href = "/index.php?g=Wap&m=Card&a=card&token=occcgv1404262269&wecha_id=oqmEBjybcKqjL-XVKsLRhuHImfko";
		}else if(data==3){
			 
			alert('该商家会员卡缺货了');
		}else if(data==4){
			 
			alert('您的积分不够领取改会员卡');
		}else{  
			 
			alert('稍后再试.');
		}
    },
    "json")
});

function check1(obj){	 
	if(obj.value == ''){
		alert("请输入您的微信名称.");
		document.getElementById(obj.id).style.background="red";
		return;
	}
}

function check2(obj){   
  	document.getElementById(obj.id).style.background="white";  
}
function check3(obj){
	if(obj.value == ''){
		alert('手机号码必须填写');
		document.getElementById(obj.id).style.background="red";
		return;
	}
	reg=/^0{0,1}(13[0-9]|145|15[0-9]|18[0-9])[0-9]{8}$/i;
	  if(!reg.test(obj.value)){   
			alert("错误,请输入11位的手机号！");
			document.getElementById(obj.id).style.background="red";
			return;
	 }
}

</script></div><script type="text/javascript">window.shareData = {  
            "moduleName":"Index",
            "moduleID":"0",
            "imgUrl": "", 
            "sendFriendLink": "http://demo.pigcms.cn/index.php?g=Wap&m=Index&a=index&token=occcgv1404262269",
            "tTitle": "",
            "tContent": ""
};
</script><script>
		window.shareData.sendFriendLink=window.shareData.sendFriendLink.replace('http://demo.pigcms.cn','http://demo.pigcms.cn');
		document.addEventListener('WeixinJSBridgeReady', function onBridgeReady() {
        WeixinJSBridge.on('menu:share:appmessage', function (argv) {
         shareHandle('friend');
            WeixinJSBridge.invoke('sendAppMessage', { 
                "img_url": window.shareData.imgUrl,
                "img_width": "640",
                "img_height": "640",
                "link": window.shareData.sendFriendLink,
                "desc": window.shareData.tContent,
                "title": window.shareData.tTitle
            }, function (res) {
                _report('send_msg', res.err_msg);
            })
        });

        WeixinJSBridge.on('menu:share:timeline', function (argv) {
         shareHandle('frineds');
            WeixinJSBridge.invoke('shareTimeline', {
                "img_url": window.shareData.imgUrl,
                "img_width": "640",
                "img_height": "640",
                "link": window.shareData.sendFriendLink,
                "desc": window.shareData.tContent,
                "title": window.shareData.tTitle
            }, function (res) {
                _report('timeline', res.err_msg);
            });
        });

        WeixinJSBridge.on('menu:share:weibo', function (argv) {
         shareHandle('weibo');
            WeixinJSBridge.invoke('shareWeibo', {
                "content": window.shareData.tContent,
                "url": window.shareData.sendFriendLink,
            }, function (res) {
                _report('weibo', res.err_msg);
            });
        });
        }, false)
        
        function shareHandle(to) {
	var submitData = {
		module: window.shareData.moduleName,
		moduleid: window.shareData.moduleID,
		token:'occcgv1404262269',
		wecha_id:'oqmEBjybcKqjL-XVKsLRhuHImfko',
		url: window.shareData.sendFriendLink,
		to:to
	};
	$.post('/index.php?g=Wap&m=Share&a=shareData&token=occcgv1404262269&wecha_id=oqmEBjybcKqjL-XVKsLRhuHImfko',submitData,function (data) {},'json')
}
        </script></body></html>