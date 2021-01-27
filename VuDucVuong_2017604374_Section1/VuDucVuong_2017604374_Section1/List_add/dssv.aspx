<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="dssv.aspx.cs" Inherits="VuDucVuong_2017604374_Section1.List_add.dssv" %>

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
                    <asp:TemplateField HeaderText="Delete">
                        <ItemTemplate>
                            <asp:Button ID="xoa" CommandName="xoa" CommandArgument='<%# Bind("masv") %>' Text="Delete" OnCommand="Xoa_Click" runat="server" />
                        </ItemTemplate>
                    </asp:TemplateField>
                     <asp:TemplateField HeaderText="Edit">
                        <ItemTemplate>
                            <asp:Button ID="edit" CommandName="edit" CommandArgument='<%# Bind("masv") %>' Text="Edit" OnCommand="Edit_Click" runat="server" />
                        </ItemTemplate>
                    </asp:TemplateField>
                </Columns>
            </asp:GridView>
            <asp:Button ID="btnAdd" Text="Add Student" PostBackUrl="~/List_add/tsv.aspx" runat="server" />
        </div>
    </form>
</body>
</html>
