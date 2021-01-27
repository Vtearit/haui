<!DOCTYPE html>
<html>
    <head>
        <title>Check Captcha</title>
        <link href="style-sheet.css" type="text/css" rel="stylesheet" />
    </head>
    
    <body>
        <form method="POST">
            <h2>Check Captcha</h2>
            <p>Please enter the captcha:</p>
            <input type="text" name="input"/>
            <img src="captcha.php" title="" alt="" />
            <br/>
            <input type="submit" name="submit" value="check" />
            <?php
                session_start();
                if(isset($_POST['submit'])){
                    $input = $_POST['input'];
                    if($input == $_SESSION['captcha']) {
                        echo "<script language='javascript'>alert('Right captcha !!');";
                        echo "location.href='check_captcha.php';</script>";
                        // $_SESSION['message'] = "*Right captcha !!!";
                    }
                    else {
                        echo "<script language='javascript'>alert('Wrong captcha !!');";
                        echo "location.href='check_captcha.php';</script>";
                        // $_SESSION['message'] = "*Wrong captcha !!!";
                    }
                }
            ?>
          
        </form>

    </body>
</html>