<%@ Page Language="C#" AutoEventWireup="true" CodeFile="SessionDemo.aspx.cs" Inherits="SessionDemo" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <h2>Session Demo</h2>
        <%
            Response.Write("Session id: " + Session.SessionID);

            if (Session["count"] == null)            {
                Session["count"] = 1;
            }
            else {
                int c =  Convert.ToInt16(Session["count"]);
                c++;
                Session["count"] = c;
            }            
            Response.Write("<br />count = " + Session["count"]);

            //Application
             if (Application["app"] == null)            {
                Application["app"] = 1;
            }
            else {
                int c =  Convert.ToInt16(Application["app"]);
                c++;
                Application["app"] = c;
            }            
            Response.Write("<br /><br />app = " + Application["app"]);

            //Session.Remove("count");

            %>
        <br />
        <a href="Home.aspx">Home</a>


    
    </div>
    </form>
</body>
</html>
