<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Macdinh.aspx.cs" Inherits="GiaiPTB2.Macdinh" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <meta charset="utf-8">
		<!-- viewport là cổng xem của thiết bị -->
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Giải Phương Trình Bậc 2</title>
    <link href="css/login.css" rel="stylesheet" type="text/css" />
	<link href="css/all.css" rel="stylesheet" type="text/css" />
	<link href="css/bootstrap.css" rel="stylesheet" type="text/css" />
	<link href="css/bootstrap-grid.css" rel="stylesheet" type="text/css" />
</head>
<body>
    <form id="form1" runat="server" class="frmlogin" name="frmlogin">
         <div class="container">
			<div class="row">
				<div class="col-md-6 offset-md-3 mybg">
					<div class="row">
				<!-- Text-center được định nghĩa sẵn trong bootstrap -->
						<div class="col-md-12 text-center mytitle">
                            <asp:Label ID="TieuDe" Text="Giải Phương Trình Bậc 2" runat="server" Font-Size="Large" Font-Bold="true" ></asp:Label>
                            <br />
                            <asp:Label ID="CongThuc" Text="- Công Thức: a*x^2 + b*x + c = 0 -" runat="server" Font-Size="Smaller"></asp:Label>
						</div>
					</div>
					<div class="form-group row">
						<label for="inputName" class="col-sm-4 col-form-label text-right">Nhập a</label>
						<div class="col-sm-8">
							<asp:TextBox ID="a" runat="server"></asp:TextBox>
						</div>
					</div>
					<div class="form-group row">
						<label for="inputName" class="col-sm-4 col-form-label text-right">Nhập b</label>
						<div class="col-sm-8">
							<asp:TextBox ID="b" runat="server"></asp:TextBox>
						</div>
					</div>
                    <div class="form-group row">
						<label for="inputName" class="col-sm-4 col-form-label text-right">Nhập c</label>
						<div class="col-sm-8">
							<asp:TextBox ID="c" runat="server"></asp:TextBox>
						</div>
					</div>
						
					<div class="form-group row">
                           <div class="col-sm-1"></div>
						<div class="col-sm-10">
							<div class="form-check">
								<asp:Label ID="rs" runat="server" Text="" ForeColor="#ff3300"></asp:Label>
							</div>
						</div>
                        <div class="col-sm-1"></div>
					</div>
						
					<div class="form-group row">
						<div class="col-sm-12 text-center">
                            <asp:Button ID="btnKetqua" Text="Kết quả" runat="server" CssClass="btn btn-primary" OnClick="btnKetqua_Click" />
							<asp:Button ID="btnTrolai" Text="Trở lại" runat="server" CssClass="btn btn-primary" OnClick="btnTrolai_Click" />
						</div>
					</div>
						
					<div class="form-group row">
						<div class="col-sm-12 text-right">
							<a href="Default.aspx">English</a>
						</div>
					</div>

				</div>
			</div>
		</div>
    </form>
</body>
</html>
