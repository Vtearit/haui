<%@page import="Modal.Item"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thanh Toán || 500AE</title>
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.4.1/css/all.css"
	integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz"
	crossorigin="anonymous">
	<script src="https://code.jquery.com/jquery-3.4.1.min.js"
		integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>

<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
	integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
	crossorigin="anonymous"></script>
	<link rel="stylesheet" href="../Css/Fstyle.css">
</head>
<script>
$(document).ready(function(){

	$("#nameUser").keypress(function(){
		$("#nameUser_alert").html('')
	})
		$("#addressUser").keypress(function(){
		$("#addressUser_alert").html('')
	})
	$("#phoneUser").keypress(function(){
		$("#phoneUser_alert").html('')
	})
	$("#dateRecieve").keypress(function(){
		$("#dateRecieve_alert").html('')
	})
	$("#submit").click(function(){
		var flag=0
		var nameUser= $("#nameUser").val()
		var phoneUser= $("#phoneUser").val()
		var addressUser= $("#addressUser").val()
		var dateRecieve = $("#dateRecieve").val()
		var idCustomer = $(this).attr("data-id")
		var fullDate= new Date()
		var twoDigitMonth = ((fullDate.getMonth().length+1) === 1)? (fullDate.getMonth()+1) : '0' + (fullDate.getMonth()+1);
	 	var currentDate =  fullDate.getFullYear()+ "-" + twoDigitMonth + "-" + fullDate.getDate();
	 	if(nameUser.trim()==''){
			$("#nameUser_alert").html("(*)Họ tên không được để trống! ")
			flag=1
		}
		if(phoneUser.trim()==''){
			$("#phoneUser_alert").html("(*)SDT không được để trống! ")
			flag=1
		} 
		if(addressUser.trim()==''){
			$("#addressUser_alert").html("(*)Địa chỉ không được để trống! ")
			flag=1
		} 
		if(dateRecieve.trim()==''){
			$("#dateRecieve_alert").html("(*)Ngày nhận không được để trống! ")
			flag=1
		}
		if(dateRecieve<currentDate){
			$("#dateRecieve_alert").html("(*)Ngày nhận phải lớn hơn ngày hiện tại! ")
			flag=1
		}
		
		if(flag==0){
			$.ajax({
				type: "post",
				url: "/ShopDienTuOnline/orderServlet",
				data: {
					nameUser : nameUser,
					phoneUser : phoneUser,
					addressUser : addressUser,
					dateRecieve : dateRecieve,
					idCustomer : idCustomer
				},
				success : function(response){
					if(response=="success"){
						window.location.href("http://localhost:8080/ShopDienTuOnline/Views/Home.jsp");
						$("#triggerPayment").trigger('click')
					}
					else if(response=="wrong"){
							} 
				} 
				
			});
		}
	})
})
</script>
<body>
<%@ include file="header.jsp"%>
	<div class=container">
      <div class="contactform-wrap">
            <form action="#" class="form-validate">
                <h3 class="component-ttl component-ttl-ct component-ttl-hasdesc" style="font-size: 30px; margin: 0; margin-top: 30px; margin-bottom: 10px;
    font-family: -webkit-pictograph;"><span>ĐẶT HÀNG</span></h3>
                <p class="component-desc component-desc-ct">Khách hàng xin vui lòng xác nhận thông tin</p>
                <p class="contactform-field contactform-text">
                    <label class="contactform-label">HỌ TÊN</label><!-- NO SPACE --><span class="contactform-input"><input placeholder="Tên Khách Hàng" id="nameUser" type="text" value="<%=user.getName() %>">
                   <span class="alert" id="nameUser_alert"></span>
                    </span>
               		
                </p>
                <p class="contactform-field contactform-text">
                    <label class="contactform-label">ĐỊA CHỈ</label><!-- NO SPACE --><span class="contactform-input"><input placeholder="Địa Chỉ Khách Hàng" id="addressUser" type="text" value="<%=user.getAddress() %>" >
                   <span class="alert" id="addressUser_alert"></span>
                    </span>
                	
                </p>
                <p class="contactform-field contactform-text">
                    <label class="contactform-label">SDT</label><!-- NO SPACE --><span class="contactform-input"><input placeholder="Số Điện Thoại Khách Hàng" id="phoneUser" type="text" value="<%=user.getPhone() %>" >
                    <span class="alert" id="phoneUser_alert"></span>
                    </span>
                	
                </p>
                <p class="contactform-field contactform-text">
                    <label class="contactform-label">NGÀY NHẬN</label><!-- NO SPACE --><span class="contactform-input"> <input type="date" id="dateRecieve">
                	<span class="alert" id="dateRecieve_alert"></span>
                </span>
                </p>
                     <img style="width: 100px; height: auto;float: left; margin-left: 200px;" alt="" src="../img/logo-png/Paypal.png">
                <p class="contactform-submit">
                    <input style="position: relative;right: -20px;" data-id="<%=user.getId() %>" value="XÁC NHẬN VÀ THANH TOÁN" type="button" id="submit">
                </p>
           
          	
                    </div>
        </div>
            <%@ include file="Footer.jsp"%>
        
</body>
</html>