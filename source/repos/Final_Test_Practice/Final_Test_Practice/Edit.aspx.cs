using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Final_Test_Practice
{
    public partial class Edit : System.Web.UI.Page
    {
        DataUtil data = new DataUtil();
        protected void Page_Load(object sender, EventArgs e)
        {
            if (!IsPostBack)
            {
                Student s = (Student)Session["sv"];
                txtID.Text = s.masv.ToString();
                txtName.Text = s.hoten;
                txtAddress.Text = s.diachi;
                txtPhone.Text = s.dienthoai;
                ddl_Class_ID.DataSource = data.dsClass();
                ddl_Class_ID.DataTextField = "tenlop";
                ddl_Class_ID.DataValueField = "malop";
                DataBind();
                ddl_Class_ID.SelectedValue = s.malop.ToString();
            }
        }

        protected void btnOk_Click(object sender, EventArgs e)
        {
            try
            {
                Student s = new Student();
                s.masv = int.Parse(txtID.Text);
                s.hoten = txtName.Text;
                s.diachi = txtAddress.Text;
                s.dienthoai = txtPhone.Text;
                s.malop = int.Parse(ddl_Class_ID.SelectedValue);
                data.updateStudent(s);
                msg.Text = "Update record successfully";
            }
            catch (Exception ex)
            {
                msg.Text = "Error" + ex.Message;
            }
        }
    }
}