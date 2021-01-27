<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Them.aspx.cs" Inherits="Them" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <h2>
            Them sinh vien
        </h2>
        Ho ten <asp:TextBox ID="ht" runat="server" />
        <asp:Button ID="btn" Text="Gui di" runat="server" PostBackUrl="~/Xuly.aspx" />
        <asp:HiddenField ID="action" Value="them"  runat="server"/>
    </div>
    </form>
</body>
</html>
