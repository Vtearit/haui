<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Default.aspx.cs" Inherits="VuDucVuong_2017604374_Section1.Default" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Quản lý sinh viên</title>
    <link href="StyleSheet.css" type="text/css" rel="stylesheet" />
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <div id="container">
                <h1>
                    My Project Web
                </h1>
                <nav>
                    <ul>
                        <li><a href="danhsach.aspx">Danh sách sinh viên</a></li>
                        <li><a href="themsv.aspx">Thêm sinh viên</a></li>
                        <li><a href="suasv.aspx">Sửa sinh viên</a></li>
                        <li><a href="danhsach_DataList.aspx">Danh sách - DataList</a></li>
                        <li><a href="tinhtoan.aspx">Tính bình phương</a></li>
                    </ul>
                </nav>

                <aside>
                    <%--<img src="picture/myself.jpg" alt="nam" height="200px" width="200px"/>--%>
                    <asp:UpdatePanel ID="UpdatePanel1" runat="server">
                        <ContentTemplate>
                            <asp:ScriptManager ID="ScriptManager1" runat="server"></asp:ScriptManager>
                            <asp:Timer ID="Timer1" runat="server" Interval="2000 " OnTick="Timer1_Tick"></asp:Timer>
                            <asp:Image ID="img" runat="server" ImageUrl="Picture/anh1.jpg" Height="200" Width="200" />
                        </ContentTemplate>
                    </asp:UpdatePanel>
                    
                    
                    <h3>Links</h3>
                    <ul>
                        <li><a href="#">Home</a></li>
                        <li><a href="#">Tutorial</a></li>
                        <li><a href="#">Download</a></li>
                        <li><a href="List_add/dssv.aspx">Help</a></li>
                    </ul>
                </aside>

                <section id="main">
                    <h2>Data here</h2>
                    <p>
                            This is the first paragraph.
                    </p>
                    <p>
                            This is the second paragraph.
                    </p>
                </section>

                <footer> Hanoi University of Industry</footer>
            </div>
            <!-- Close container -->
        </div>
    </form>
</body>
</html>
