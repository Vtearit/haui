<%@ Page Title="" Language="C#" MasterPageFile="~/MasterPage.Master" AutoEventWireup="true" CodeBehind="Classes_List.aspx.cs" Inherits="Final_Test_Practice.Classes_List" %>
<asp:Content ID="Content1" ContentPlaceHolderID="title" runat="server">
    Classes List
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="content" runat="server">
    <h2>
        Classes List
    </h2>
    <asp:GridView ID="gvClass" runat="server" AutoGenerateColumns="false">
        <Columns>
            <asp:TemplateField HeaderText="Class">
                <ItemTemplate>
                    <asp:Button runat="server" ID="find" CommandName="select" CommandArgument='<%# Bind("malop") %>' OnCommand="find_Command" Text='<%# Bind("tenlop") %>' />
                </ItemTemplate>
            </asp:TemplateField>
        </Columns>
    </asp:GridView>

    <asp:GridView runat="server" ID="gv_Student" AutoGenerateColumns="false">
        <Columns>
            <asp:BoundField DataField="masv" />
            <asp:BoundField DataField="hoten" />
        </Columns>
    </asp:GridView>

    <asp:Label runat="server" ID="classes_msg" ></asp:Label>
</asp:Content>
