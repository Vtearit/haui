<%@ Page Language="C#" AutoEventWireup="true" CodeFile="CookieDemo.aspx.cs" Inherits="CookieDemo" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <h2>Cookie Demo</h2>
         <%
             //c1
             HttpCookie user = new HttpCookie("username");
             user.Value = "Hoa Nguyen";
             user.Expires = DateTime.Now.AddMinutes(30);
             Response.Cookies.Add(user);
             Response.Write("Ban vua tao cookie: " + Request.Cookies["username"].Value);
             //Xoa cookie
             Response.Cookies["username"].Expires = DateTime.Now.AddDays(-1);

             //c2
             Response.Cookies["password"].Value = "123456";
             Response.Cookies["password"].Expires = DateTime.Now.AddMilliseconds(30);

             //c3
             Response.Cookies["sinhvien"]["khoahoc"] = "2018";
             Response.Cookies["sinhvien"]["nganhhoc"] = "cntt";
             Response.Cookies["sinhvien"].Expires = DateTime.Now.AddDays(2);



             %>
        <br />
        <asp:Button ID="b" Text="Sang trang 2" runat="server" PostBackUrl="~/CookieDemo2.aspx" />
    
    </div>
    </form>
</body>
</html>
