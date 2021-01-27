<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="dssv.aspx.cs" Inherits="Section1030.dssv" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <h2>Student List</h2>
            <asp:GridView ID="gvDs" runat="server" AutoGenerateColumns="false">
                <Columns>
                    <asp:BoundField DataField="masv" HeaderText="Student ID" />
                    <asp:BoundField DataField="hoten" HeaderText="Student Name" />
                    <asp:BoundField DataField="diachi" HeaderText="Address" />
                    <asp:BoundField DataField="dienthoai" HeaderText="Phone" />
                    <asp:BoundField DataField="malop" HeaderText="Class ID" />
                </Columns>
            </asp:GridView>
        </div>
    </form>
</body>
</html>
