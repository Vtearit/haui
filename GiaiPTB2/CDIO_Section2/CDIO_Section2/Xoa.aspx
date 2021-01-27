<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Xoa.aspx.cs" Inherits="Xoa" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    <h2>
            Xoa sinh vien
        </h2>
        Nhap id  <asp:TextBox ID="id" runat="server" />
        <asp:Button ID="btn" Text="Gui di" runat="server" PostBackUrl="~/Xuly.aspx" />
    <asp:HiddenField ID="action" Value="xoa"  runat="server"/>

    </div>
    </form>
</body>
</html>
