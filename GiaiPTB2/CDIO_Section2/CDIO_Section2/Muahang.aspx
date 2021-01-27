<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Muahang.aspx.cs" Inherits="Muahang" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div>
            <%
                if (Request.Form["action"]=="mua")
                {
                    string tenhang = Request.Form["tenhang"];
                    Sanpham sp = new Sanpham();
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
            <h3>Ban vua mua:</h3>
            <table width="300" border="1">
                <tr>
                    <th>Ten san pham</th>
                    <th>So luong</th>
                    <th>Xoa san pham</th>
                </tr>


                <% List<Sanpham> ds = (List<Sanpham>)Session["giohang"];
                    if (ds != null)
                    {

                        foreach (Sanpham x in ds)
                        { %>

                <tr>
                    <td><%= x.tensp %></td>
                    <td><%= x.soluong %></td>
                    <td><a href="Muahang.aspx?action=del&tensp=<%= x.tensp %>">Xoa</a></td>

                </tr>


                <%     }
                    }
                %>
            </table>
             
            <br />
            <a href="Cuahang.aspx">Mua tiep</a>
            <br />
            <a href="Dat_hang.aspx">Dat hang</a>

            <br />
            <br />
            <asp:Button ID="bt2" Text="Xoa gio hang" runat="server" OnClick="bt2_Click" />
        </div>
    </form>
</body>
</html>
