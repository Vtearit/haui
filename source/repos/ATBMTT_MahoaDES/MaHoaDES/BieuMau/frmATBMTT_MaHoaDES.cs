using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using MaHoaDES.DoiTuong;
using AOC.ThuVien;
 
using System.Threading;

namespace MaHoaDES.BieuMau
{
    public partial class frmATBMTT_MaHoaDES : Form
    {
        public frmATBMTT_MaHoaDES()
        {
            InitializeComponent();
        }       
        private void EnableHoacDisableNut(bool b)
        {
            btnChonFile.Enabled = btnGiaiMaFile.Enabled = btnGiaiMaVanBan.Enabled = btnMaHoaFile.Enabled = btnMaHoaVanBan.Enabled = b;
        }
        int MaHoaHayGiaiMa = 1;
        bool FileHayChuoi = false;
        DES64Bit MaHoaDES64;
        Khoa Khoa;
        Thread thread;
        private void Chay()
        {
            ThreadStart start= new ThreadStart(MaHoa);
            thread = new Thread(start);
            thread.Start();
        }
       
        private void MaHoa()
        {               
                MaHoaDES64 = new DES64Bit();
                if (!ckbCheDoDebug.Checked)
                {
                    EnableHoacDisableNut(false);
                    progressBar1.Value = 10;
                    timer1.Enabled = true;
                }
            
                TenTienTrinh = "";
                 
                GiaiDoan = 0;
                Dem = 0;
               
                if (FileHayChuoi)
                {
                    Khoa = new Khoa(txtKhoaFile.Text);
                    if (MaHoaHayGiaiMa == 1)
                    {
                        GiaiDoan = 0;
                        ChuoiNhiPhan chuoi = DocFileTxt.FileReadToBinary(txtFileNguon.Text);
                        GiaiDoan = 1;
                        ChuoiNhiPhan KQ = MaHoaDES64.ThucHienDES(Khoa, chuoi, 1);
                        GiaiDoan = 2;
                        DocFileTxt.WriteBinaryToFile(txtFileDich.Text, KQ);
                        GiaiDoan = 3;
                        MessageBox.Show("Mã hóa file thành công");
                    }
                    else
                    {
                        GiaiDoan = 0;
                        ChuoiNhiPhan chuoi = DocFileTxt.FileReadToBinary(txtFileNguon.Text);
                        GiaiDoan = 1;
                        ChuoiNhiPhan KQ = MaHoaDES64.ThucHienDES(Khoa, chuoi, -1);
                        if (KQ == null)
                        {
                            MessageBox.Show("Lỗi giải mã . kiểm tra khóa ");
                            return;
                        }
                        GiaiDoan = 2;
                        DocFileTxt.WriteBinaryToFile(txtFileDich.Text, KQ);
                        GiaiDoan = 3;
                        MessageBox.Show("Giải mã file thành công");
                    }
                }
                else
                {
                    Khoa = new Khoa(txtKhoaVanBan.Text);
                    if (MaHoaHayGiaiMa == 1)
                    {

                        MaHoaDES64 = new DES64Bit();
                        GiaiDoan = 0;
                        GiaiDoan = 1;
                        string kq=MaHoaDES64.ThucHienDESText(Khoa, txtVanBanNguon.Text, 1);
                        txtVanBanDich.Text = kq;
                        GiaiDoan = 2;
                        GiaiDoan = 3;
                        MessageBox.Show("Mã hóa chuỗi thành công");
                    }
                    else
                    {
                        MaHoaDES64 = new DES64Bit();
                        GiaiDoan = 0;
                        GiaiDoan = 1;
                        string kq = MaHoaDES64.ThucHienDESText(Khoa, txtVanBanNguon.Text, -1);
                        txtVanBanDich.Text = kq;
                        if (kq == "")
                        {
                            return;
                        }
                        GiaiDoan = 2;
                        GiaiDoan = 3;
                        MessageBox.Show("Giải mã chuỗi thành công");
                    }
                }
                if (!ckbCheDoDebug.Checked)
                {
                    EnableHoacDisableNut(true);
                    timer1.Enabled = false;
                }            
        }

        private void txtMaHoaVanBan_Click(object sender, EventArgs e)
        {
            FileHayChuoi = false;
            MaHoaHayGiaiMa = 1;
            EnableHoacDisableNut(false);
            MaHoa();
            EnableHoacDisableNut(true);
        }

        private void txtGiaiMaVanBan_Click(object sender, EventArgs e)
        {

            FileHayChuoi = false;
            MaHoaHayGiaiMa = -1;
            EnableHoacDisableNut(false);
            MaHoa();
            EnableHoacDisableNut(true);
        }

        private void btnMaHoaFile_Click(object sender, EventArgs e)
        {
            FileHayChuoi = true;
            MaHoaHayGiaiMa = 1;
            EnableHoacDisableNut(false);
            Chay();
            if(ckbCheDoDebug.Checked)EnableHoacDisableNut(true);
        }

        private void btnGiaiMaFile_Click(object sender, EventArgs e)
        {
            FileHayChuoi = true;
            MaHoaHayGiaiMa = -1;
            EnableHoacDisableNut(false);
            Chay();
            if (ckbCheDoDebug.Checked) EnableHoacDisableNut(true);
        }
        private void btnChonFile_Click(object sender, EventArgs e)
        {
            txtFileNguon.Clear();
            txtFileDich.Clear();

            if (openFileDialog1.ShowDialog() == DialogResult.OK)
            {
                txtFileNguon.Text = openFileDialog1.FileName;
                txtFileDich.Text = openFileDialog1.FileName.Replace(".", "_2.");
            }
        }
        public static string TenTienTrinh="";
        public static int GiaiDoan = -1;
        private static int Dem = 0;
        private void timer1_Tick(object sender, EventArgs e)
        {
           
            
            if (GiaiDoan != -1)
                Dem++;
            if (GiaiDoan == 0)
            {
       
                if (Dem > 200)
                    Dem = 200;
            }
            else if (GiaiDoan == 1)
            {
                if (Dem < 200)
                    Dem = 200;
                if (Dem > 600)
                    Dem = 600;
               
            }
            else if (GiaiDoan == 2)
            {
                if (Dem < 600)
                    Dem = 600;
                if (Dem >= 900)
                    Dem = 900;
                 
            }
            else if (GiaiDoan == 3)
            {
                Dem = 1000;
                
            }
            progressBar1.Value = Dem;
        }

        private void frmMaHoaDES_FormClosing(object sender, FormClosingEventArgs e)
        {
            if (thread!=null && thread.ThreadState == ThreadState.Running)
                thread.Abort();
            //e.Cancel = DangChay;
        }

        private void txtKhoaFile_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (!Char.IsControl(e.KeyChar) && !(ChuoiHexa.BoHexa.Contains(e.KeyChar)))
            {
                e.Handled = true;
            }
        }

        private void btnExit_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void label10_Click(object sender, EventArgs e)
        {

        }
    }
}
