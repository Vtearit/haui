<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="Default.aspx.cs" Inherits="GiaiPTB2.Default" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <meta charset="utf-8">
		<!-- viewport là cổng xem của thiết bị -->
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Quadratic Equation Calculator</title>
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
                            <asp:Label ID="Title" Text="Quadratic Equation" runat="server" Font-Size="Large" Font-Bold="true" ></asp:Label>
                            <br />
                            <asp:Label ID="Formula" Text="- Formula: a*x2 + b*x + c = 0 -" runat="server" Font-Size="Smaller"></asp:Label>
						</div>
					</div>
					<div class="form-group row">
						<label for="inputName" class="col-sm-4 col-form-label text-right">Input a</label>
						<div class="col-sm-8">
							<asp:TextBox ID="a" runat="server"></asp:TextBox>
						</div>
					</div>
					<div class="form-group row">
						<label for="inputName" class="col-sm-4 col-form-label text-right">Input b</label>
						<div class="col-sm-8">
							<asp:TextBox ID="b" runat="server"></asp:TextBox>
						</div>
					</div>
                    <div class="form-group row">
						<label for="inputName" class="col-sm-4 col-form-label text-right">Input c</label>
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
                            <asp:Button ID="btnResult" Text="Result" runat="server" OnClick="btnResult_Click" CssClass="btn btn-primary" />
							<asp:Button ID="btnReset" Text="Reset" runat="server" OnClick="btnReset_Click" CssClass="btn btn-primary" />
						</div>
					</div>
						
					<div class="form-group row">
						<div class="col-sm-12 text-right">
							<a href="Macdinh.aspx">Tiếng Việt</a>
						</div>
					</div>

				</div>
			</div>
		</div>
    </form>
</body>
</html>
