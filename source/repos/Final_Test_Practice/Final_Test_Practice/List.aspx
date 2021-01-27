<%@ Page Title="" Language="C#" MasterPageFile="~/MasterPage.Master" AutoEventWireup="true" CodeBehind="List.aspx.cs" Inherits="Final_Test_Practice.List" %>
<asp:Content ID="Content1" ContentPlaceHolderID="title" runat="server">
    Student List
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="content" runat="server">
    <h2>Student List</h2>
    <asp:GridView ID="grvList" runat="server" AutoGenerateColumns="false" Width="590px">
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
            <asp:TemplateField HeaderText="Edit" >
                <ItemTemplate>
                    <asp:Button ID="edit"  CommandName="edit" CommandArgument='<%# Bind("masv") %>' Text="Edit" OnCommand ="edit_Command" runat="server" />
                </ItemTemplate>
            </asp:TemplateField>
        </Columns>
    </asp:GridView>
    <br />
    <asp:Button ID="btnAdd" Text="Add Student" PostBackUrl="~/Add.aspx" runat="server" Width="100px" Height="30px" />
</asp:Content>
