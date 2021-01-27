using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Final_Test_Practice
{
    public partial class Classes_List : System.Web.UI.Page
    {
        DataUtil data = new DataUtil();
        protected void Page_Load(object sender, EventArgs e)
        {
            if (!IsPostBack)
            {
                gvClass.DataSource = data.dsClass();
                DataBind();
            }
        }

        protected void find_Command(object sender, CommandEventArgs e)
        {
            try
            {
                if(e.CommandName == "select")
                {
                    int malop = Convert.ToInt16(e.CommandArgument);
                    gvClass.DataSource = data.dsClass();
                    gv_Student.DataSource = data.dsStudentOnClass(malop);
                    DataBind();
                }
            }
            catch(Exception ex)
            {
                classes_msg.Text = "Error" + ex.Message;
            }
        }
    }
}