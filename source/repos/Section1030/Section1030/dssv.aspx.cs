using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Section1030
{
    public partial class dssv : System.Web.UI.Page
    {
        DataUtil data = new DataUtil();
        protected void Page_Load(object sender, EventArgs e)
        {
            showData();
        }

        private void showData()
        {
            gvDs.DataSource = data.dsSinhvien();
            DataBind();
        }
    }
}