using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace VuDucVuong_2017604374_Section1.List_add
{
    public partial class dssv : System.Web.UI.Page
    {
        DataUtil data = new DataUtil();
        protected void Page_Load(object sender, EventArgs e)
        {
            if(!IsPostBack)
                showData();
        }

        private void showData()
        {
            gvDs.DataSource = data.dsSinhvien();
            DataBind();
        }
        protected void Xoa_Click(object sender, CommandEventArgs e)
        {
            if(e.CommandName == "xoa")
            {
                int m = Convert.ToInt16(e.CommandArgument);
                data.XoaSv(m);
                showData();
            }
        }

        protected void Edit_Click(object sender, CommandEventArgs e)
        {
            if (e.CommandName == "edit")
            {
                int m = Convert.ToInt16(e.CommandArgument);
                sinhvien s = data.selectOneSv(m);
                Session["sv"] = s;
                Response.Redirect("ssv.aspx");
            }
        }
    }
}