<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="tsv.aspx.cs" Inherits="VuDucVuong_2017604374_Section1.List_add.tsv" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <h2>Add student</h2>
            <asp:Table ID="tblDs" runat="server" Width="200px">
                <asp:TableRow>
                    <asp:TableCell>Student Name:</asp:TableCell>
                    <asp:TableCell>
                        <asp:TextBox ID="txtName" runat="server" />
                    </asp:TableCell></asp:TableRow><asp:TableRow>
                    <asp:TableCell>Address:</asp:TableCell><asp:TableCell>
                        <asp:TextBox ID="txtAddress" runat="server" />
                    </asp:TableCell></asp:TableRow><asp:TableRow>
                    <asp:TableCell>Phone:</asp:TableCell><asp:TableCell>
                        <asp:TextBox ID="txtPhone" runat="server" />
                    </asp:TableCell></asp:TableRow><asp:TableRow>
                    <asp:TableCell>Class ID:</asp:TableCell><asp:TableCell>
                        <asp:TextBox ID="txtClassID" runat="server" />
                    </asp:TableCell></asp:TableRow></asp:Table><br />
            <asp:Button ID="btnOK" Text="OK" runat="server" Width="100px" OnClick="btnOK_Click" />&nbsp; &nbsp; <asp:Button ID="btnCancel" Text="Cancel" runat="server" Width="100px" PostBackUrl="~/List_add/dssv.aspx" /><p>
                <asp:Label ID="msg" runat="server" />
            </p>
            <asp:Button ID="btnDs" runat="server" Text="Student List" PostBackUrl="~/List_add/dssv.aspx" Width="200px" /></div>
    </form>
</body>
</html>
