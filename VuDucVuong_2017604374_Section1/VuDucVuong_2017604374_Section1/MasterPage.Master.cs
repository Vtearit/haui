using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace VuDucVuong_2017604374_Section1
{
    public partial class Site1 : System.Web.UI.MasterPage
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            RandomImage();
        }
        private void RandomImage()
        {
            Random r = new Random();
            int n = r.Next(1, 5);
            img.ImageUrl = "Picture/anh" + n + ".jpg";
        }

        protected void Timer1_Tick(object sender, EventArgs e)
        {
            RandomImage();
        }
    }
}