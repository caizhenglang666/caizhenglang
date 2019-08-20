$(document).ready(function(){
	var vue=new Vue({
		el:"#app",
		data:{
			username:"",
			password:""
		},
		methods:{
			login:function(){
				if(this.username==""){
					alert("账号不能为空");
					return false;
				}
				if(this.password==""){
					alert("密码不能为空");
					return false;
				}
				this.$http.post("login.do",{"username":this.username,"password":this.password},{emulateJSON:true}).then(
				     function(success){
				    	 var result=success.body;
				    	 if(result.state==0){
				    		 alert(result.message);
				    	 }else{
				    		 sessionStorage.setItem("user",JSON.stringify(result.data));
				    		 var s=sessionStorage.getItem("user");
				    		 location.href="index.do";
				    	 }
				     },function(error){
				    	 alert(error.status);
				     }		
				)
			}
		}
	});
})