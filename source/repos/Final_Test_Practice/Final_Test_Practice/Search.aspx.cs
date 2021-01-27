using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data;
using System.Data.SqlClient;
using System.Configuration;

namespace Final_Test_Practice
{
    public partial class Search : System.Web.UI.Page
    {
        DataUtil data = new DataUtil();

        protected void Page_Load(object sender, EventArgs e)
        {
            if (!IsPostBack)
            {
                Student s = (Student)Session["student"];
                txtID.Text = s.masv.ToString();
                txtName.Text = s.hoten;
                txtAddress.Text = s.diachi;
                txtPhone.Text = s.dienthoai;
                txtClass_ID.Text = s.malop.ToString();
            }
        }

        
        

        protected void btnDel_Command(object sender, CommandEventArgs e)
        {
            try
            {
                if (e.CommandName == "delete")
                {
                    int m = int.Parse(txtID.Text);
                    data.deleteStudent(m);
                    msg.Text = "Delete Record Successfully";
                }
            }
            catch (Exception ex) {
                msg.Text = "Error: " + ex.Message;
            }
        }
    }
}