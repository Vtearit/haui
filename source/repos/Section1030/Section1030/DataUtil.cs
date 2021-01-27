using System;
using System.Linq;
using System.Web;
using System.Data.Sql;
using System.Data.SqlClient;

namespace Section1030.app_code
{
    public class DataUtil
    {
        SqlConnection conn;
        public DataUtil()
        {
            string sqlCon = "Data Source=DESKTOP-QCVV79D\\SQLEXPRESS01;Initial Catalog=sinhviendb2;Integrated Security=True";
            conn = new SqlConnection(sqlCon);
        }
        public List<sinhvien> dsSinhvien()
        {
            List<sinhvien> ds = new List<sinhvien>();
            string sql = "Select * from sinhvien";
            conn.Open();
            SqlCommand cmd = new SqlCommand(sql, conn);
            SqlDataReader rd = cmd.ExecuteReader();
            while (rd.Read())
            {
                sinhvien s = new sinhvien();
                s.masv = (int)rd["masv"];
                s.hoten = (string)rd["hoten"];
                s.diachi = (string)rd["diachi"];
                s.dienthoai = (string)rd["dienthoai"];
                s.malop = (int)rd["malop"];
                ds.Add(s);
            }
            conn.Close();
            return ds;
        }
    }
}
}