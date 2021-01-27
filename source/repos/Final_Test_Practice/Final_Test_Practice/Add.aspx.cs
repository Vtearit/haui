using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Final_Test_Practice
{
    public partial class Add : System.Web.UI.Page
    {
        DataUtil data = new DataUtil();
        protected void Page_Load(object sender, EventArgs e)
        {
            if (!IsPostBack)
            {
                ddl_Class_ID.DataSource = data.dsClass();
                ddl_Class_ID.DataTextField = "tenlop";
                ddl_Class_ID.DataValueField = "malop";
                DataBind();
            }
        }

        protected void btnOk_Click(object sender, EventArgs e)
        {
            try
            {
                Student s = new Student();
                s.hoten = txtName.Text;
                s.diachi = txtAddress.Text;
                s.dienthoai = txtPhone.Text;
                s.malop = int.Parse(ddl_Class_ID.SelectedValue);
                s.anh = txtImage.Text;
                data.addStudent(s);
                msg.Text = "Add Student Successfully";
            }
            catch (Exception ex)
            {
                msg.Text = "Add Student Error: " + ex.Message;
            }
        }
    }
}