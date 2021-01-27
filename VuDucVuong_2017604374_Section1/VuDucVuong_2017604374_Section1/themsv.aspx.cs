using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace VuDucVuong_2017604374_Section1
{
    public partial class themsv : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void ItemInserting(object sender, FormViewInsertEventArgs e)
        {
            // Upload file to server
            FileUpload f = (FileUpload)FormView1.FindControl("FileUpload1");
            String path = Server.MapPath("~/Picture/");
            f.PostedFile.SaveAs(path + f.FileName);
            // Ser parameter to Anh Column
            SqlDataSource1.InsertParameters["anh"].DefaultValue = f.FileName;
        }
    }
}