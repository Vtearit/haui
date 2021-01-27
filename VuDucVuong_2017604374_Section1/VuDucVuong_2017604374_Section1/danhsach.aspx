<%@ Page Title="" Language="C#" MasterPageFile="~/MasterPage.Master" AutoEventWireup="true" CodeBehind="danhsach.aspx.cs" Inherits="VuDucVuong_2017604374_Section1.danhsach" %>
<asp:Content ID="Content1" ContentPlaceHolderID="tieude" runat="server">
    Danh sách
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="noidung" runat="server">
    <h2> Danh sách sinh viên</h2>
    <asp:GridView ID="GridView1" runat="server" AllowPaging="True" AllowSorting="True" AutoGenerateColumns="False" DataKeyNames="masv" DataSourceID="SqlDataSource1">
        <Columns>
            <asp:BoundField DataField="masv" HeaderText="ID" InsertVisible="False" ReadOnly="True" SortExpression="masv" />
            <asp:BoundField DataField="hoten" HeaderText="Name" SortExpression="hoten" />
            <asp:BoundField DataField="diachi" HeaderText="Address" SortExpression="diachi" />
            <asp:BoundField DataField="dienthoai" HeaderText="Phone" SortExpression="dienthoai" />
            <asp:BoundField DataField="malop" HeaderText="Class ID" SortExpression="malop" />
            <asp:BoundField DataField="anh" HeaderText="Image" SortExpression="anh" />
            <asp:CommandField ShowDeleteButton="True" ShowEditButton="True" ShowSelectButton="True" HeaderText="Action" HeaderStyle-ForeColor="blue" />
        </Columns>
</asp:GridView>
<asp:SqlDataSource ID="SqlDataSource1" runat="server" ConflictDetection="CompareAllValues" ConnectionString="<%$ ConnectionStrings:sinhviendb2ConnectionString %>" DeleteCommand="DELETE FROM [sinhvien] WHERE [masv] = @original_masv AND (([hoten] = @original_hoten) OR ([hoten] IS NULL AND @original_hoten IS NULL)) AND (([diachi] = @original_diachi) OR ([diachi] IS NULL AND @original_diachi IS NULL)) AND (([dienthoai] = @original_dienthoai) OR ([dienthoai] IS NULL AND @original_dienthoai IS NULL)) AND (([malop] = @original_malop) OR ([malop] IS NULL AND @original_malop IS NULL)) AND (([anh] = @original_anh) OR ([anh] IS NULL AND @original_anh IS NULL))" InsertCommand="INSERT INTO [sinhvien] ([hoten], [diachi], [dienthoai], [malop], [anh]) VALUES (@hoten, @diachi, @dienthoai, @malop, @anh)" OldValuesParameterFormatString="original_{0}" SelectCommand="SELECT * FROM [sinhvien]" UpdateCommand="UPDATE [sinhvien] SET [hoten] = @hoten, [diachi] = @diachi, [dienthoai] = @dienthoai, [malop] = @malop, [anh] = @anh WHERE [masv] = @original_masv AND (([hoten] = @original_hoten) OR ([hoten] IS NULL AND @original_hoten IS NULL)) AND (([diachi] = @original_diachi) OR ([diachi] IS NULL AND @original_diachi IS NULL)) AND (([dienthoai] = @original_dienthoai) OR ([dienthoai] IS NULL AND @original_dienthoai IS NULL)) AND (([malop] = @original_malop) OR ([malop] IS NULL AND @original_malop IS NULL)) AND (([anh] = @original_anh) OR ([anh] IS NULL AND @original_anh IS NULL))">
    <DeleteParameters>
        <asp:Parameter Name="original_masv" Type="Int32" />
        <asp:Parameter Name="original_hoten" Type="String" />
        <asp:Parameter Name="original_diachi" Type="String" />
        <asp:Parameter Name="original_dienthoai" Type="String" />
        <asp:Parameter Name="original_malop" Type="Int32" />
        <asp:Parameter Name="original_anh" Type="String" />
    </DeleteParameters>
    <InsertParameters>
        <asp:Parameter Name="hoten" Type="String" />
        <asp:Parameter Name="diachi" Type="String" />
        <asp:Parameter Name="dienthoai" Type="String" />
        <asp:Parameter Name="malop" Type="Int32" />
        <asp:Parameter Name="anh" Type="String" />
    </InsertParameters>
    <UpdateParameters>
        <asp:Parameter Name="hoten" Type="String" />
        <asp:Parameter Name="diachi" Type="String" />
        <asp:Parameter Name="dienthoai" Type="String" />
        <asp:Parameter Name="malop" Type="Int32" />
        <asp:Parameter Name="anh" Type="String" />
        <asp:Parameter Name="original_masv" Type="Int32" />
        <asp:Parameter Name="original_hoten" Type="String" />
        <asp:Parameter Name="original_diachi" Type="String" />
        <asp:Parameter Name="original_dienthoai" Type="String" />
        <asp:Parameter Name="original_malop" Type="Int32" />
        <asp:Parameter Name="original_anh" Type="String" />
    </UpdateParameters>
</asp:SqlDataSource>
</asp:Content>
