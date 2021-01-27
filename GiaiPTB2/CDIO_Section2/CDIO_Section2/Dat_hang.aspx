<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Dat_hang.aspx.cs" Inherits="Dat_hang" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <h3>Ban vua dat hang:</h3>
            <table width="300" border="1">
                <tr>
                    <th>Ten san pham</th>
                    <th>So luong</th>
                    
                </tr>

          <% List<Sanpham> ds = (List<Sanpham>)Session["giohang"];
               int tong = 0;
              if (ds != null)
              {

                  foreach (Sanpham x in ds)
                  { %>

                <tr>
                    <td><%= x.tensp %></td>
                    <td><%= x.soluong %></td>                   
                </tr>
                 
                <%  tong = tong + x.soluong;

                        }
                    }
                    Session.Remove("giohang");
                %>
                <br />
               
            </table>
         Tong so san pham ban dat mua la <%= tong %>
     <br />
            <a href="Cuahang.aspx">Mua tiep</a>
            <br />
    </div>
    </form>
</body>
</html>
