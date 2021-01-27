<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Home.aspx.cs" Inherits="CDIO_Section2_Homework.Home" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <h1>Add Student</h1>
            <br />
            id <asp:TextBox ID="txtId" runat="server"></asp:TextBox> <br />
            name <asp:TextBox ID="txtName" runat="server"></asp:TextBox><br />
            age <asp:TextBox ID="txtAge" runat="server"></asp:TextBox><br />
            address <asp:TextBox ID="txtAddress" runat="server"></asp:TextBox><br />
            <asp:Button ID="add" Text="Add" runat="server" /><br />
            <asp:HiddenField ID="action" Value="add"  runat="server" OnValueChanged="action_ValueChanged"/>
        </div>
        <div>
             <%
                if (Request.Form["action"]=="mua")
                {
                    string tenhang = Request.Form["tenhang"];
                    Sinhvien sv = new Sinhvien();
                    sp.tensp = tenhang;
                    sp.soluong = 1;

                    List<Sanpham> li = (List<Sanpham>)Session["giohang"];
                    if (li == null)
                    {
                        li = new List<Sanpham>();
                    }
                    if (li.Contains(sp))
                    {
                        int i = li.IndexOf(sp);
                        li[i].soluong++;
                    }
                    else
                    {
                        li.Add(sp);
                    }
                    Session["giohang"] = li;
                }

                if (Request.QueryString["action"] == "del")
                {
                    string tensp = Request.QueryString["tensp"];
                    Sanpham s = new Sanpham();
                    s.tensp = tensp;
                    List<Sanpham> li = (List<Sanpham>)Session["giohang"];
                    li.Remove(s);
                    Session["giohang"] = li;

                }
            %>

            <h1>List of Student</h1><br />
            <table width="300" border="1">
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Age</th>
                    <th>Address</th>
                    <th>Edit</th>
                    <th>Delete</th>
                </tr>
                <%
                    
                    %>
             </table>

        </div>
    </form>
</body>
</html>
