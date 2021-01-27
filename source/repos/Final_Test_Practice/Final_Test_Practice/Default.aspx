<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Default.aspx.cs" Inherits="Final_Test_Practice.Default" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>My project</title>
    <link href="StyleSheet.css" rel="stylesheet" type="text/css" />
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
                        <li><a href="List.aspx">Danh sách sinh viên</a></li>
                        <li><a href="Add.aspx">Thêm sinh viên</a></li>
                        <li>
                            <a href="Classes_List.aspx">Danh sách lớp học</a>
                        </li>
                    </ul>
                </nav>
                 <aside>
                    <h3>Search</h3>
                     <br />
                        <asp:RadioButtonList ID="rdSearch" runat="server">
                                <asp:ListItem Selected="True" Value="ID" Text="ID"/>
                                <asp:ListItem Value="Name" Text="Name" />
                            </asp:RadioButtonList>
                     <asp:TextBox ID="txtSearch" runat="server" Height="20px" Width="150px" /> <asp:Label ID="msg" ForeColor="Red" runat="server" />
                     <br /> <br />
                     <asp:Button Text="Search" runat="server" Width="100px" OnClick="btnSearch_Click" />
                </aside>

                <section id="main">
                    
                </section>
                <footer> Vu Duc Vuong - 2017604374 </footer>
            </div>
            <!-- Close container -->
        </div>
    </form>
</body>
</html>
