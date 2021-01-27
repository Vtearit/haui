<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Input.aspx.cs" Inherits="CDIO_Section3.Input" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
    <style type="text/css">
        label{
            width: 120px;
            float: left;
        }
    </style>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <h2>Đăng ký user</h2>
            <p>
                <label>Họ tên</label>
                <asp:TextBox ID="hoten" runat="server" />
                <asp:RequiredFieldValidator ID="rht" runat="server" 
                    ErrorMessage="Bạn phải nhập họ tên" ControlToValidate="hoten" ForeColor="red"></asp:RequiredFieldValidator>
            </p>
            <p>
                <label>Tuổi</label>
                <asp:TextBox ID="tuoi" runat="server" />
                <asp:RangeValidator ID="rtuoi" runat="server" 
                    ErrorMessage="Bạn phải nhập tuổi từ 18 đến 60" ControlToValidate="tuoi"
                    type="Integer" MinimumValue="18" MaximumValue="60" ForeColor="red" Display="Dynamic"></asp:RangeValidator>
                <asp:RequiredFieldValidator ID="rtuoi2" runat="server" ErrorMessage="Bạn phải nhập tuổi" ControlToValidate="tuoi"
                    ForeColor="red" Display="Dynamic"></asp:RequiredFieldValidator>
            </p>
            <p>
                <label>Điện thoại</label>
                <asp:TextBox ID="dienthoai" runat="server" />
                <asp:RegularExpressionValidator ID="rdt" runat="server" 
                    ErrorMessage="Bạn phải nhập số điện thoại 10 số" ControlToValidate="dienthoai" ValidationExpression="\d{3}-\d{3}-\d{4}" ForeColor="red"></asp:RegularExpressionValidator>
            </p>
            <p>
                <label>Email</label>
                <asp:TextBox ID="email" runat="server" />
                <asp:RegularExpressionValidator ID="remail" runat="server" 
                    ErrorMessage="Bạn phải nhập email đúng định dạng" ControlToValidate="email" ForeColor="red" ValidationExpression="\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*"></asp:RegularExpressionValidator>
            </p>
            <p>
                <label>Username</label>
                <asp:TextBox ID="username" runat="server" />
                <asp:RegularExpressionValidator ID="ruser" runat="server"
                    ErrorMessage="Bạn phải nhập username ít nhất 5 ký tự" ControlToValidate="username"
                    ValidationExpression="[a-zA-Z][a-zA-Z0-9]{4,}"></asp:RegularExpressionValidator>
            </p>
            <p>
                <label>Passwword</label>
                <asp:TextBox ID="password" runat="server" />
                <asp:RegularExpressionValidator ID="rp" runat="server"
                    ErrorMessage="Bạn phải nhập password ít nhất 6 ký tự"
                    ControlToValidate="password"
                    ValidationExpression=".{6,}"></asp:RegularExpressionValidator>
            </p>
            <p>
                <label>Re Password</label>
                <asp:TextBox ID="password2" runat="server" />
                <asp:CompareValidator id="rp2" runat="server"
                    ControlToValidate="password2"
                    ErrorMessage="Bạn nhập pass chưa khớp"
                    ControlToCompare="password"
                ></asp:CompareValidator>
                    
            </p>
            <p>
                <asp:Button ID="btn" Text="Gửi đi" runat="server" PostBackUrl="~/Output.aspx" />
                <asp:Button Text="Cancel" runat="server" />
            </p>
        </div>
    </form>
</body>
</html>
