<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Cuahang.aspx.cs" Inherits="Cuahang" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <h2>Shopping Online</h2>
        <asp:DropDownList ID="tenhang" runat="server" Size="4">
            <asp:ListItem>Dien thoai Oppo</asp:ListItem>
            <asp:ListItem>Kinh cuong luc 10D</asp:ListItem>
            <asp:ListItem>The nho 64GB</asp:ListItem>
            <asp:ListItem>Ốp lưng điện thoại</asp:ListItem>

        </asp:DropDownList>
        <asp:Button ID="mua" Text="Mua hang" runat="server" PostBackUrl="Muahang.aspx"/>
        <asp:HiddenField ID="action" Value="mua"  runat="server"/>
    
    </div>
    </form>
</body>
</html>
