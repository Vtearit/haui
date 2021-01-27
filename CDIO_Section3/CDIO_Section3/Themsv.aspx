<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Themsv.aspx.cs" Inherits="CDIO_Section3.Themsv" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <h2>Thêm sinh viên</h2>

        </div>
        <asp:FormView ID="FormView1" runat="server" DataKeyNames="masv" DataSourceID="SqlDataSource1" Height="148px" Width="427px"
            DefaultMode="Insert" CellPadding="4" ForeColor="#222222" OnItemInserted="InsertedCmd" OnPageIndexChanging="FormView1_PageIndexChanging"
            >
            <EditItemTemplate>
                masv:
                <asp:Label ID="masvLabel1" runat="server" Text='<%# Eval("masv") %>' />
                <br />
                hoten:
                <asp:TextBox ID="hotenTextBox" runat="server" Text='<%# Bind("hoten") %>' />
                <br />
                diachi:
                <asp:TextBox ID="diachiTextBox" runat="server" Text='<%# Bind("diachi") %>' />
                <br />
                dienthoai:
                <asp:TextBox ID="dienthoaiTextBox" runat="server" Text='<%# Bind("dienthoai") %>' />
                <br />
                malop:
                <asp:TextBox ID="malopTextBox" runat="server" Text='<%# Bind("malop") %>' />
                <br />
                anh:
                <asp:TextBox ID="anhTextBox" runat="server" Text='<%# Bind("anh") %>' />
                <br />
                <asp:LinkButton ID="UpdateButton" runat="server" CausesValidation="True" CommandName="Update" Text="Update" />
                &nbsp;<asp:LinkButton ID="UpdateCancelButton" runat="server" CausesValidation="False" CommandName="Cancel" Text="Cancel" />
            </EditItemTemplate>
            <EditRowStyle BackColor="#CCFFFF" />
            <FooterStyle BackColor="#507CD1" Font-Bold="True" ForeColor="White" />
            <HeaderStyle BackColor="#507CD1" Font-Bold="True" ForeColor="White" />
            <InsertItemTemplate>
                hoten:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <asp:TextBox ID="hotenTextBox" runat="server" Text='<%# Bind("hoten") %>' />
                <br />
                diachi:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <asp:TextBox ID="diachiTextBox" runat="server" Text='<%# Bind("diachi") %>' />
                <br />
                dienthoai:
                <asp:TextBox ID="dienthoaiTextBox" runat="server" Text='<%# Bind("dienthoai") %>' />
                <br />
                malop:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <asp:DropDownList ID="DropDownList1" runat="server" DataSourceID="SqlDataSource1" DataTextField="tenlop" DataValueField="malop" SelectedValue='<%# Bind("malop") %>'>
                </asp:DropDownList>
                <asp:SqlDataSource ID="SqlDataSource1" runat="server" ConnectionString="<%$ ConnectionStrings:sinhviendb2ConnectionString %>" SelectCommand="SELECT * FROM [lophoc]"></asp:SqlDataSource>
            
                <br />
                anh:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <asp:TextBox ID="malopTextBox" runat="server" Text='<%# Bind("malop") %>' />
                <br />
                <asp:LinkButton ID="InsertButton" runat="server" CausesValidation="True" CommandName="Insert" Text="Insert" />
                &nbsp;<asp:LinkButton ID="InsertCancelButton" runat="server" CausesValidation="False" CommandName="Cancel" Text="Cancel" />
            </InsertItemTemplate>
            <ItemTemplate>
                masv:
                <asp:Label ID="masvLabel" runat="server" Text='<%# Eval("masv") %>' />
                <br />
                hoten:
                <asp:Label ID="hotenLabel" runat="server" Text='<%# Bind("hoten") %>' />
                <br />
                diachi:
                <asp:Label ID="diachiLabel" runat="server" Text='<%# Bind("diachi") %>' />
                <br />
                dienthoai:
                <asp:Label ID="dienthoaiLabel" runat="server" Text='<%# Bind("dienthoai") %>' />
                <br />
                malop:
                <asp:Label ID="malopLabel" runat="server" Text='<%# Bind("malop") %>' />
                <br />
                anh:
                <asp:Label ID="anhLabel" runat="server" Text='<%# Bind("anh") %>' />
                <br />
                <asp:LinkButton ID="EditButton" runat="server" CausesValidation="False" CommandName="Edit" Text="Edit" />
                &nbsp;<asp:LinkButton ID="DeleteButton" runat="server" CausesValidation="False" CommandName="Delete" Text="Delete" />
                &nbsp;<asp:LinkButton ID="NewButton" runat="server" CausesValidation="False" CommandName="New" Text="New" />
            </ItemTemplate>
            <PagerStyle BackColor="#2461BF" ForeColor="White" HorizontalAlign="Center" />
            <RowStyle BackColor="#EFF3FB" />
        </asp:FormView>
        <asp:SqlDataSource ID="SqlDataSource1" runat="server" ConnectionString="<%$ ConnectionStrings:sinhviendb2ConnectionString %>" DeleteCommand="DELETE FROM [sinhvien] WHERE [masv] = @masv" InsertCommand="INSERT INTO [sinhvien] ([hoten], [diachi], [dienthoai], [malop], [anh]) VALUES (@hoten, @diachi, @dienthoai, @malop, @anh)" SelectCommand="SELECT * FROM [sinhvien]" UpdateCommand="UPDATE [sinhvien] SET [hoten] = @hoten, [diachi] = @diachi, [dienthoai] = @dienthoai, [malop] = @malop, [anh] = @anh WHERE [masv] = @masv">
            <DeleteParameters>
                <asp:Parameter Name="masv" Type="Int32" />
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
                <asp:Parameter Name="masv" Type="Int32" />
            </UpdateParameters>
        </asp:SqlDataSource>
        <br />
        <br />
        <asp:Label ID="errmsg" Text="" runat="server" ForeColor="red" />
        <br />
        <a href="Danhsach.aspx">Danh sách sinh viên</a>
    </form>
</body>
</html>
