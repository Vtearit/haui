<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Xuly.aspx.cs" Inherits="Xuly" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <h2>Thong tin vua gui len</h2>
        <%
            string action = Request.Form["action"];
            if (action == "them")
            {
                string ht = Request.Form["ht"];
                Response.Write("Ban vua gui: " + ht);
            }
            else if (action == "xoa")
            {
                string id = Request.Form["id"];
                Response.Write("Ban vua gui: " + id);
            }

            if (Request.QueryString["action"] == "100")
            {
                int x = int.Parse(Request.QueryString["action"]);
                for (int i = 0; i < x; i++)
                {
                    Response.Write(i + " ");
                }
            }
            %>
    
    </div>
    </form>
</body>
</html>
