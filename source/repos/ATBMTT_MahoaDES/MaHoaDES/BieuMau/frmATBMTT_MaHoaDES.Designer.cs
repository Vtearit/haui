namespace MaHoaDES.BieuMau
{
    partial class frmATBMTT_MaHoaDES
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.progressBar1 = new System.Windows.Forms.ProgressBar();
            this.BoxTextCrypt = new System.Windows.Forms.GroupBox();
            this.txtVanBanDich = new System.Windows.Forms.RichTextBox();
            this.txtVanBanNguon = new System.Windows.Forms.RichTextBox();
            this.txtKhoaVanBan = new System.Windows.Forms.TextBox();
            this.label4 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.btnMaHoaVanBan = new System.Windows.Forms.Button();
            this.btnGiaiMaVanBan = new System.Windows.Forms.Button();
            this.BoxFileCrypt = new System.Windows.Forms.GroupBox();
            this.ckbCheDoDebug = new System.Windows.Forms.CheckBox();
            this.txtFileDich = new System.Windows.Forms.TextBox();
            this.label9 = new System.Windows.Forms.Label();
            this.txtFileNguon = new System.Windows.Forms.TextBox();
            this.txtKhoaFile = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.label8 = new System.Windows.Forms.Label();
            this.btnChonFile = new System.Windows.Forms.Button();
            this.lblEncryptedFilename = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.btnMaHoaFile = new System.Windows.Forms.Button();
            this.btnGiaiMaFile = new System.Windows.Forms.Button();
            this.openFileDialog1 = new System.Windows.Forms.OpenFileDialog();
            this.timer1 = new System.Windows.Forms.Timer(this.components);
            this.label7 = new System.Windows.Forms.Label();
            this.label10 = new System.Windows.Forms.Label();
            this.btnExit = new System.Windows.Forms.Button();
            this.groupBox1.SuspendLayout();
            this.BoxTextCrypt.SuspendLayout();
            this.BoxFileCrypt.SuspendLayout();
            this.SuspendLayout();
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.progressBar1);
            this.groupBox1.Location = new System.Drawing.Point(6, 159);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(420, 61);
            this.groupBox1.TabIndex = 27;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "Tiến trình";
            // 
            // progressBar1
            // 
            this.progressBar1.Location = new System.Drawing.Point(9, 22);
            this.progressBar1.Maximum = 1000;
            this.progressBar1.Name = "progressBar1";
            this.progressBar1.Size = new System.Drawing.Size(395, 20);
            this.progressBar1.TabIndex = 0;
            // 
            // BoxTextCrypt
            // 
            this.BoxTextCrypt.Controls.Add(this.txtVanBanDich);
            this.BoxTextCrypt.Controls.Add(this.txtVanBanNguon);
            this.BoxTextCrypt.Controls.Add(this.txtKhoaVanBan);
            this.BoxTextCrypt.Controls.Add(this.label4);
            this.BoxTextCrypt.Controls.Add(this.label5);
            this.BoxTextCrypt.Controls.Add(this.label2);
            this.BoxTextCrypt.Controls.Add(this.btnMaHoaVanBan);
            this.BoxTextCrypt.Controls.Add(this.btnGiaiMaVanBan);
            this.BoxTextCrypt.Location = new System.Drawing.Point(449, 109);
            this.BoxTextCrypt.Name = "BoxTextCrypt";
            this.BoxTextCrypt.Size = new System.Drawing.Size(432, 268);
            this.BoxTextCrypt.TabIndex = 26;
            this.BoxTextCrypt.TabStop = false;
            this.BoxTextCrypt.Text = "Mã hoá và Giải mã văn bản(Text)";
            // 
            // txtVanBanDich
            // 
            this.txtVanBanDich.Location = new System.Drawing.Point(43, 127);
            this.txtVanBanDich.Name = "txtVanBanDich";
            this.txtVanBanDich.Size = new System.Drawing.Size(383, 93);
            this.txtVanBanDich.TabIndex = 26;
            this.txtVanBanDich.Text = "";
            // 
            // txtVanBanNguon
            // 
            this.txtVanBanNguon.Location = new System.Drawing.Point(43, 18);
            this.txtVanBanNguon.Name = "txtVanBanNguon";
            this.txtVanBanNguon.Size = new System.Drawing.Size(383, 64);
            this.txtVanBanNguon.TabIndex = 26;
            this.txtVanBanNguon.Text = "";
            // 
            // txtKhoaVanBan
            // 
            this.txtKhoaVanBan.ImeMode = System.Windows.Forms.ImeMode.NoControl;
            this.txtKhoaVanBan.Location = new System.Drawing.Point(43, 88);
            this.txtKhoaVanBan.MaxLength = 16;
            this.txtKhoaVanBan.Name = "txtKhoaVanBan";
            this.txtKhoaVanBan.Size = new System.Drawing.Size(383, 20);
            this.txtKhoaVanBan.TabIndex = 17;
            this.txtKhoaVanBan.Text = "0123456789ABCDEF";
            this.txtKhoaVanBan.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.txtKhoaFile_KeyPress);
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(40, 111);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(133, 13);
            this.label4.TabIndex = 20;
            this.label4.Text = "Kết quả mã hoá và giải mã";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(6, 88);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(32, 13);
            this.label5.TabIndex = 16;
            this.label5.Text = "Khoá";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(8, 28);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(37, 13);
            this.label2.TabIndex = 19;
            this.label2.Text = "Text : ";
            // 
            // btnMaHoaVanBan
            // 
            this.btnMaHoaVanBan.Location = new System.Drawing.Point(97, 229);
            this.btnMaHoaVanBan.Name = "btnMaHoaVanBan";
            this.btnMaHoaVanBan.Size = new System.Drawing.Size(101, 25);
            this.btnMaHoaVanBan.TabIndex = 10;
            this.btnMaHoaVanBan.Text = "Mã hoá văn bản";
            this.btnMaHoaVanBan.UseVisualStyleBackColor = true;
            this.btnMaHoaVanBan.Click += new System.EventHandler(this.txtMaHoaVanBan_Click);
            // 
            // btnGiaiMaVanBan
            // 
            this.btnGiaiMaVanBan.Location = new System.Drawing.Point(226, 229);
            this.btnGiaiMaVanBan.Name = "btnGiaiMaVanBan";
            this.btnGiaiMaVanBan.Size = new System.Drawing.Size(102, 25);
            this.btnGiaiMaVanBan.TabIndex = 13;
            this.btnGiaiMaVanBan.Text = "Giải mã văn bản";
            this.btnGiaiMaVanBan.UseVisualStyleBackColor = true;
            this.btnGiaiMaVanBan.Click += new System.EventHandler(this.txtGiaiMaVanBan_Click);
            // 
            // BoxFileCrypt
            // 
            this.BoxFileCrypt.Controls.Add(this.ckbCheDoDebug);
            this.BoxFileCrypt.Controls.Add(this.groupBox1);
            this.BoxFileCrypt.Controls.Add(this.txtFileDich);
            this.BoxFileCrypt.Controls.Add(this.label9);
            this.BoxFileCrypt.Controls.Add(this.txtFileNguon);
            this.BoxFileCrypt.Controls.Add(this.txtKhoaFile);
            this.BoxFileCrypt.Controls.Add(this.label1);
            this.BoxFileCrypt.Controls.Add(this.label8);
            this.BoxFileCrypt.Controls.Add(this.btnChonFile);
            this.BoxFileCrypt.Controls.Add(this.lblEncryptedFilename);
            this.BoxFileCrypt.Controls.Add(this.label3);
            this.BoxFileCrypt.Controls.Add(this.btnMaHoaFile);
            this.BoxFileCrypt.Controls.Add(this.btnGiaiMaFile);
            this.BoxFileCrypt.Location = new System.Drawing.Point(12, 109);
            this.BoxFileCrypt.Name = "BoxFileCrypt";
            this.BoxFileCrypt.Size = new System.Drawing.Size(434, 268);
            this.BoxFileCrypt.TabIndex = 24;
            this.BoxFileCrypt.TabStop = false;
            this.BoxFileCrypt.Text = "Mã hoá và giải mã 1 file";
            // 
            // ckbCheDoDebug
            // 
            this.ckbCheDoDebug.AutoSize = true;
            this.ckbCheDoDebug.Location = new System.Drawing.Point(6, 136);
            this.ckbCheDoDebug.Name = "ckbCheDoDebug";
            this.ckbCheDoDebug.Size = new System.Drawing.Size(94, 17);
            this.ckbCheDoDebug.TabIndex = 27;
            this.ckbCheDoDebug.Text = "Chế độ debug";
            this.ckbCheDoDebug.UseVisualStyleBackColor = true;
            // 
            // txtFileDich
            // 
            this.txtFileDich.Location = new System.Drawing.Point(71, 44);
            this.txtFileDich.Name = "txtFileDich";
            this.txtFileDich.ReadOnly = true;
            this.txtFileDich.Size = new System.Drawing.Size(313, 20);
            this.txtFileDich.TabIndex = 24;
            // 
            // label9
            // 
            this.label9.AutoSize = true;
            this.label9.Location = new System.Drawing.Point(8, 48);
            this.label9.Name = "label9";
            this.label9.Size = new System.Drawing.Size(57, 13);
            this.label9.TabIndex = 25;
            this.label9.Text = "Đổi tên file";
            // 
            // txtFileNguon
            // 
            this.txtFileNguon.Location = new System.Drawing.Point(71, 15);
            this.txtFileNguon.Name = "txtFileNguon";
            this.txtFileNguon.ReadOnly = true;
            this.txtFileNguon.Size = new System.Drawing.Size(243, 20);
            this.txtFileNguon.TabIndex = 5;
            // 
            // txtKhoaFile
            // 
            this.txtKhoaFile.ImeMode = System.Windows.Forms.ImeMode.NoControl;
            this.txtKhoaFile.Location = new System.Drawing.Point(71, 88);
            this.txtKhoaFile.MaxLength = 16;
            this.txtKhoaFile.Name = "txtKhoaFile";
            this.txtKhoaFile.Size = new System.Drawing.Size(314, 20);
            this.txtKhoaFile.TabIndex = 23;
            this.txtKhoaFile.Text = "0123456789ABCDEF";
            this.txtKhoaFile.KeyPress += new System.Windows.Forms.KeyPressEventHandler(this.txtKhoaFile_KeyPress);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(5, 18);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(32, 13);
            this.label1.TabIndex = 6;
            this.label1.Text = "File : ";
            // 
            // label8
            // 
            this.label8.AutoSize = true;
            this.label8.Location = new System.Drawing.Point(8, 88);
            this.label8.Name = "label8";
            this.label8.Size = new System.Drawing.Size(32, 13);
            this.label8.TabIndex = 21;
            this.label8.Text = "Khoá";
            // 
            // btnChonFile
            // 
            this.btnChonFile.Location = new System.Drawing.Point(320, 13);
            this.btnChonFile.Name = "btnChonFile";
            this.btnChonFile.Size = new System.Drawing.Size(64, 23);
            this.btnChonFile.TabIndex = 16;
            this.btnChonFile.Text = "Files..";
            this.btnChonFile.UseVisualStyleBackColor = true;
            this.btnChonFile.Click += new System.EventHandler(this.btnChonFile_Click);
            // 
            // lblEncryptedFilename
            // 
            this.lblEncryptedFilename.AutoSize = true;
            this.lblEncryptedFilename.Location = new System.Drawing.Point(8, 48);
            this.lblEncryptedFilename.Name = "lblEncryptedFilename";
            this.lblEncryptedFilename.Size = new System.Drawing.Size(0, 13);
            this.lblEncryptedFilename.TabIndex = 7;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(8, 73);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(0, 13);
            this.label3.TabIndex = 8;
            // 
            // btnMaHoaFile
            // 
            this.btnMaHoaFile.Location = new System.Drawing.Point(102, 229);
            this.btnMaHoaFile.Name = "btnMaHoaFile";
            this.btnMaHoaFile.Size = new System.Drawing.Size(89, 25);
            this.btnMaHoaFile.TabIndex = 12;
            this.btnMaHoaFile.Text = "Mã hoá file";
            this.btnMaHoaFile.UseVisualStyleBackColor = true;
            this.btnMaHoaFile.Click += new System.EventHandler(this.btnMaHoaFile_Click);
            // 
            // btnGiaiMaFile
            // 
            this.btnGiaiMaFile.Location = new System.Drawing.Point(225, 229);
            this.btnGiaiMaFile.Name = "btnGiaiMaFile";
            this.btnGiaiMaFile.Size = new System.Drawing.Size(89, 25);
            this.btnGiaiMaFile.TabIndex = 11;
            this.btnGiaiMaFile.Text = "Giải mã file";
            this.btnGiaiMaFile.UseVisualStyleBackColor = true;
            this.btnGiaiMaFile.Click += new System.EventHandler(this.btnGiaiMaFile_Click);
            // 
            // openFileDialog1
            // 
            this.openFileDialog1.FileName = "openFileDialog1";
            // 
            // timer1
            // 
            this.timer1.Tick += new System.EventHandler(this.timer1_Tick);
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label7.ForeColor = System.Drawing.SystemColors.HotTrack;
            this.label7.Location = new System.Drawing.Point(376, 59);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(0, 20);
            this.label7.TabIndex = 37;
            // 
            // label10
            // 
            this.label10.AutoSize = true;
            this.label10.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label10.ForeColor = System.Drawing.SystemColors.HotTrack;
            this.label10.Location = new System.Drawing.Point(302, 34);
            this.label10.Name = "label10";
            this.label10.Size = new System.Drawing.Size(280, 25);
            this.label10.TabIndex = 36;
            this.label10.Text = "Mã hoá thông tin văn bản";
            this.label10.Click += new System.EventHandler(this.label10_Click);
            // 
            // btnExit
            // 
            this.btnExit.BackColor = System.Drawing.Color.Red;
            this.btnExit.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnExit.Location = new System.Drawing.Point(675, 408);
            this.btnExit.Name = "btnExit";
            this.btnExit.Size = new System.Drawing.Size(78, 30);
            this.btnExit.TabIndex = 39;
            this.btnExit.Text = "Exit";
            this.btnExit.UseVisualStyleBackColor = false;
            this.btnExit.Click += new System.EventHandler(this.btnExit_Click);
            // 
            // frmATBMTT_MaHoaDES
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(898, 473);
            this.Controls.Add(this.btnExit);
            this.Controls.Add(this.label7);
            this.Controls.Add(this.label10);
            this.Controls.Add(this.BoxTextCrypt);
            this.Controls.Add(this.BoxFileCrypt);
            this.Name = "frmATBMTT_MaHoaDES";
            this.Text = "MaHoaDES";
            this.FormClosing += new System.Windows.Forms.FormClosingEventHandler(this.frmMaHoaDES_FormClosing);
            this.groupBox1.ResumeLayout(false);
            this.BoxTextCrypt.ResumeLayout(false);
            this.BoxTextCrypt.PerformLayout();
            this.BoxFileCrypt.ResumeLayout(false);
            this.BoxFileCrypt.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.ProgressBar progressBar1;
        private System.Windows.Forms.GroupBox BoxTextCrypt;
        private System.Windows.Forms.TextBox txtKhoaVanBan;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Button btnMaHoaVanBan;
        private System.Windows.Forms.Button btnGiaiMaVanBan;
        private System.Windows.Forms.GroupBox BoxFileCrypt;
        private System.Windows.Forms.TextBox txtFileDich;
        private System.Windows.Forms.Label label9;
        private System.Windows.Forms.TextBox txtFileNguon;
        private System.Windows.Forms.TextBox txtKhoaFile;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label8;
        private System.Windows.Forms.Button btnChonFile;
        private System.Windows.Forms.Label lblEncryptedFilename;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Button btnMaHoaFile;
        private System.Windows.Forms.Button btnGiaiMaFile;
        private System.Windows.Forms.OpenFileDialog openFileDialog1;
        private System.Windows.Forms.Timer timer1;
        private System.Windows.Forms.RichTextBox txtVanBanDich;
        private System.Windows.Forms.RichTextBox txtVanBanNguon;
        private System.Windows.Forms.CheckBox ckbCheDoDebug;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.Label label10;
        private System.Windows.Forms.Button btnExit;
    }
}