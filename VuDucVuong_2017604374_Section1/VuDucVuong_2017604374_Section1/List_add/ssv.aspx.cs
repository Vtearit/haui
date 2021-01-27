using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace VuDucVuong_2017604374_Section1.List_add
{
    public partial class ssv : System.Web.UI.Page
    {
        DataUtil data = new DataUtil();
        protected void Page_Load(object sender, EventArgs e)
        {
            if(!IsPostBack)
            {
                sinhvien s = (sinhvien)Session["sv"];
                txtID.Text = s.masv.ToString();
                txtName.Text = s.hoten;
                txtAddress.Text = s.diachi;
                txtPhone.Text = s.dienthoai;
                ddlClass_ID.DataSource = data.dsLophoc();
                ddlClass_ID.DataTextField = "tenlop";
                ddlClass_ID.DataValueField = "malop";
                DataBind();
                ddlClass_ID.SelectedValue = s.malop.ToString();
            }
        }

        protected void btnUpdate_Click(object sender, EventArgs e)
        {
            try
            {
                sinhvien s = new sinhvien();
                s.masv = int.Parse(txtID.Text);
                s.hoten = txtName.Text;
                s.diachi = txtAddress.Text;
                s.dienthoai = txtPhone.Text;
                s.malop = int.Parse(ddlClass_ID.SelectedValue);
                data.UpdateSv(s);
                msg.Text = "Update record successfully";
            }
            catch (Exception ex)
            {
                msg.Text = "Error: " + ex;
            }
        }
    }
}