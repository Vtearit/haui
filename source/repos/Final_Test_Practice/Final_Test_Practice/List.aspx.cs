using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Final_Test_Practice
{
    public partial class List : System.Web.UI.Page
    {
        DataUtil data = new DataUtil();
        protected void Page_Load(object sender, EventArgs e)
        {
            if (!IsPostBack)
                showData();
        }

        private void showData()
        {
            grvList.DataSource = data.dsStudent();
            DataBind();
        }

        protected void Delete_Click(object sender, CommandEventArgs e)
        {
            if (e.CommandName == "delete")
            {
                int m = Convert.ToInt16(e.CommandArgument);
                data.deleteStudent(m);
                showData();
            }
        }

        protected void edit_Command(object sender, CommandEventArgs e)
        {
            if(e.CommandName == "edit")
            {
                int m = Convert.ToInt16(e.CommandArgument);
                Student s = data.selectOneStudent(m);
                Session["sv"] = s;
                Response.Redirect("Edit.aspx");
            }
        }
    }
}