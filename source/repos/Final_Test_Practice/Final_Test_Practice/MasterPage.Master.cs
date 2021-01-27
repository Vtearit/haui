using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Final_Test_Practice
{
    public partial class MasterPage : System.Web.UI.MasterPage
    {
        DataUtil data = new DataUtil();
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void btnSearch_Click(object sender, EventArgs e)
        {
            try
            {
                int m = int.Parse(txtSearch.Text);
                Student s = data.selectOneStudent(m);
                Session["student"] = s;
                Response.Redirect("Search.aspx");
            }
            catch
            {
                messs.Text = "(Input Data)";
            }
        }
    }
}