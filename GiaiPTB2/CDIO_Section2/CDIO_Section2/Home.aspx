<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Home.aspx.cs" Inherits="Home" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    <h2>Cac cong viec</h2>    
        <a href="Them.aspx">Them sinh vien</a><br />
        <a href="Xoa.aspx">Xoa sinh vien</a><br />
        <a href="Xuly.aspx?action=100">In cac so tu nhien</a>
        <br />
          <%

              //string user = Request.Cookies["username"].Value;
              //Response.Write("username= " + user);

              string sv = Request.Cookies["sinhvien"]["khoahoc"];
              Response.Write(", khoa hoc= " + sv);

              Response.Write("<br />count = " + Session["count"]);

            %>
    </div>
    </form>
</body>
</html>
