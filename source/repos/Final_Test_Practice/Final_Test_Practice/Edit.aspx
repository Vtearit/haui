<%@ Page Title="" Language="C#" MasterPageFile="~/MasterPage.Master" AutoEventWireup="true" CodeBehind="Edit.aspx.cs" Inherits="Final_Test_Practice.Edit" %>
<asp:Content ID="Content1" ContentPlaceHolderID="title" runat="server">
    Edit Student
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="content" runat="server">
    <asp:Table ID="tblEdit" runat="server" Width="465px">
        <asp:TableHeaderRow HorizontalAlign="Center">
            <asp:TableCell ColumnSpan="2"><h2>Edit Student</h2></asp:TableCell>
        </asp:TableHeaderRow><asp:TableRow>
            <asp:TableHeaderCell>
                ID:
            </asp:TableHeaderCell><asp:TableCell>
                <asp:TextBox ID="txtID" runat="server" Enabled="false" />
            </asp:TableCell></asp:TableRow><asp:TableRow>
            <asp:TableHeaderCell>
                Name:
            </asp:TableHeaderCell><asp:TableCell>
                <asp:TextBox ID="txtName" runat="server" />
            </asp:TableCell></asp:TableRow><asp:TableRow>
            <asp:TableHeaderCell>
                Address:
            </asp:TableHeaderCell><asp:TableCell>
                <asp:TextBox ID="txtAddress" runat="server" />
            </asp:TableCell></asp:TableRow><asp:TableRow>
            <asp:TableHeaderCell>
                Phone:
            </asp:TableHeaderCell><asp:TableCell>
                <asp:TextBox ID="txtPhone" runat="server" />
            </asp:TableCell></asp:TableRow><asp:TableRow>
            <asp:TableHeaderCell>
                Class ID:
            </asp:TableHeaderCell><asp:TableCell>
                <%--<asp:TextBox ID="txtClass_ID" runat="server" />--%>
                <asp:DropDownList ID="ddl_Class_ID" runat="server">
                </asp:DropDownList>
            </asp:TableCell></asp:TableRow><asp:TableRow>
            <asp:TableHeaderCell>
                Image:
            </asp:TableHeaderCell><asp:TableCell>
                <asp:TextBox ID="txtImage" runat="server" />
            </asp:TableCell></asp:TableRow></asp:Table><br />
    
        <asp:Button ID="btnOk" Text="Update" runat="server" OnClick="btnOk_Click" Width="100px" /> &nbsp; &nbsp; &nbsp; &nbsp; <asp:Button ID="btnCancel" Text="Cancel" runat="server" PostBackUrl="~/List.aspx" Width="100px" />
    <br />
    <br />
    <asp:Label ID="msg" ForeColor="red" runat="server" /> 
</asp:Content>
