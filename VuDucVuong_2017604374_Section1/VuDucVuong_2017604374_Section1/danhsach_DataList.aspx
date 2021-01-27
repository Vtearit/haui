<%@ Page Title="" Language="C#" MasterPageFile="~/MasterPage.Master" AutoEventWireup="true" CodeBehind="danhsach_DataList.aspx.cs" Inherits="VuDucVuong_2017604374_Section1.danhsach_DataList" %>
<asp:Content ID="Content1" ContentPlaceHolderID="tieude" runat="server">
    Danh sách sinh viên
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="noidung" runat="server">
    <h2>Danh sách sinh viên</h2>
    <asp:DataList ID="DataList1" runat="server" DataKeyField="masv" DataSourceID="SqlDataSource1" RepeatColumns="4" BorderColor="#00ccff" BorderStyle="Solid" BorderWidth="1">
        <ItemTemplate>
            Mã SV:
            <asp:Label ID="masvLabel" runat="server" Text='<%# Eval("masv") %>' />
            <br />
            Họ tên:
            <asp:Label ID="hotenLabel" runat="server" Text='<%# Eval("hoten") %>' />
            <br />
            Địa chỉ:
            <asp:Label ID="diachiLabel" runat="server" Text='<%# Eval("diachi") %>' />
            <br />
            Điện thoại:
            <asp:Label ID="dienthoaiLabel" runat="server" Text='<%# Eval("dienthoai") %>' />
            <br />
            Mã lớp:
            <asp:Label ID="malopLabel" runat="server" Text='<%# Eval("malop") %>' />
            <br />
            Ảnh:

            <asp:Image ID="anh" runat="server" ImageUrl='<%# "~/Picture/"+Eval("anh") %>' width="100" />
            <br />
<br />
        </ItemTemplate>
    </asp:DataList>
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
