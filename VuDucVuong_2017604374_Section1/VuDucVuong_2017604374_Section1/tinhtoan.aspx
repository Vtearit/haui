<%@ Page Title="" Language="C#" MasterPageFile="~/MasterPage.Master" AutoEventWireup="true" CodeBehind="tinhtoan.aspx.cs" Inherits="VuDucVuong_2017604374_Section1.tinhtoan" %>
<asp:Content ID="Content1" ContentPlaceHolderID="tieude" runat="server">
    Tính toán
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="noidung" runat="server">
    <h2>Tính bình phương</h2>
    <asp:TextBox ID="number" runat="server" ></asp:TextBox>
    <asp:Button ID="b1" Text="Tính bình phương" runat="server" PostBackUrl="~/tinhbp.aspx" />
</asp:Content>
