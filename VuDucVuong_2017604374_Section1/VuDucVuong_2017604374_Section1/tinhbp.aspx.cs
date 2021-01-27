using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace VuDucVuong_2017604374_Section1
{
    public partial class tinhbp : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            ContentPlaceHolder nd = (ContentPlaceHolder)PreviousPage.Controls[0].FindControl("noidung");
            TextBox number = (TextBox)nd.FindControl("number");
            int n = int.Parse(number.Text);
            ketqua.Text = "Bình phương của " + n + " là: " + (n * n).ToString();
        }
    }
}