using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace VuDucVuong_2017604374_Section1.List_add
{
    public partial class tsv : System.Web.UI.Page
    {
        DataUtil data = new DataUtil();
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void btnOK_Click(object sender, EventArgs e)
        {
            try
            {
                sinhvien s = new sinhvien();
                s.hoten = txtName.Text;
                s.diachi = txtAddress.Text;
                s.dienthoai = txtPhone.Text;
                s.malop = int.Parse(txtClassID.Text);
                data.addStudent(s);
                msg.Text = "Add record success !!!";
            }
            catch (Exception ex) {
                msg.Text = "Add Student Error: " + ex.Message;
            }
        }
    }
}