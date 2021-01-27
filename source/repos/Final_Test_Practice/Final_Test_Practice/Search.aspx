<%@ Page Title="" Language="C#" MasterPageFile="~/MasterPage.Master" AutoEventWireup="true" CodeBehind="Search.aspx.cs" Inherits="Final_Test_Practice.Search" %>
<%@ MasterType VirtualPath="~/MasterPage.Master"  %>
<asp:Content ID="Content1" ContentPlaceHolderID="title" runat="server">
    Search Student
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="content" runat="server">
    <h2>Search result:</h2>
    <%--<asp:GridView ID="grvSearch" runat="server" AutoGenerateColumns="false" Width="590px" ShowHeaderWhenEmpty="true" EmptyDataText="No Records Found !">
        <Columns>
            <asp:BoundField DataField="masv" HeaderText="ID" />
            <asp:BoundField DataField="hoten" HeaderText="Name" />
            <asp:BoundField DataField="diachi" HeaderText="Address" />
            <asp:BoundField DataField="dienthoai" HeaderText="Phone" />
            <asp:BoundField DataField="malop" HeaderText="Class ID" />
            <asp:TemplateField HeaderText="Delete" >
                <ItemTemplate>
                    <asp:Button ID="delete"  CommandName="delete" CommandArgument='<%# Bind("masv") %>' Text="Delete" OnCommand ="Delete_Click" runat="server"
                        OnClientClick="return ConfirmOnDelete();" />
                    <script type="text/javascript">    
                          function ConfirmOnDelete() {
                           if (confirm("Do you really want to delete?") == true)
                               return true;
                           else
                               return false;
                          }
                    </script>
                </ItemTemplate>
            </asp:TemplateField>
        </Columns>
    </asp:GridView>--%>

    <asp:Table runat="server" Width="250px">
        <asp:TableHeaderRow HorizontalAlign="Center">
            <asp:TableHeaderCell>
                ID
            </asp:TableHeaderCell>
            <asp:TableHeaderCell>
                Name
            </asp:TableHeaderCell>
            <asp:TableHeaderCell>
                Address
            </asp:TableHeaderCell>
         </asp:TableHeaderRow>
            <asp:TableFooterRow>
            <asp:TableCell>
                <asp:TextBox ID="txtID" runat="server" Enabled="false" />
            </asp:TableCell><asp:TableCell>
                <asp:TextBox ID="txtName" runat="server" Enabled="false" />
            </asp:TableCell><asp:TableCell>
                <asp:TextBox ID="txtAddress" runat="server" Enabled="false" />
            </asp:TableCell></asp:TableFooterRow>
        <asp:TableHeaderRow HorizontalAlign="Center">
            <asp:TableHeaderCell>
                Phone
            </asp:TableHeaderCell>
            <asp:TableHeaderCell>
                Class ID
            </asp:TableHeaderCell>
            <asp:TableHeaderCell>
                Image
            </asp:TableHeaderCell>
        </asp:TableHeaderRow>
        <asp:TableFooterRow>
        <asp:TableCell>
                <asp:TextBox ID="txtPhone" runat="server" Enabled="false" />
            </asp:TableCell><asp:TableCell>
                <asp:TextBox ID="txtClass_ID" runat="server" Enabled="false" />
            </asp:TableCell><asp:TableCell>
                <asp:TextBox ID="txtImage" runat="server" Enabled="false" />
            </asp:TableCell></asp:TableFooterRow></asp:Table>
    <asp:Button ID="btnDel" Text="Delete" runat="server"  CommandName="delete" OnCommand="btnDel_Command" Width="100px" OnClientClick="return ConfirmOnDelete();" />
    <script type="text/javascript">    
                          function ConfirmOnDelete() {
                           if (confirm("Do you really want to delete?") == true)
                               return true;
                           else
                               return false;
                          }
                    </script>
    &nbsp; &nbsp; &nbsp; &nbsp; 
    <asp:Button ID="btnCancel" Text="Cancel" runat="server" PostBackUrl="~/List.aspx" Width="100px" /><br />
    <br />
    <asp:Label ID="msg" ForeColor="red" runat="server" /> 
</asp:Content>
