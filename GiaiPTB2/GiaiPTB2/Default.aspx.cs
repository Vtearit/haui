using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace GiaiPTB2
{
    public partial class Default : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void btnResult_Click(object sender, EventArgs e)
        {
            double a = double.Parse(Request.Form["a"]);
            double b = double.Parse(Request.Form["b"]);
            double c = double.Parse(Request.Form["c"]);

            double delta = b * b - 4 * a * c;
            double x = (-b / 2 * a);
            double x1 = (-b + Math.Sqrt(delta)) / 2 * a;
            double x2 = (-b - Math.Sqrt(delta)) / 2 * a;
            if (delta > 0)
            {
                rs.Text = "This equation has two distinct roots : X1 = " + x1.ToString() + " và X2 = " + x2.ToString();
            }
            else if (delta == 0)
            {
                rs.Text = "This equation has double root X1 = X2 = " + x.ToString();
            }
            else if (delta < 0)
            {
                rs.Text = "This equation has no solution";
            }

        }

        protected void btnReset_Click(object sender, EventArgs e)
        {
            a.Text = "";
            b.Text = "";
            c.Text = "";
            rs.Text = "";
        }
    }
}