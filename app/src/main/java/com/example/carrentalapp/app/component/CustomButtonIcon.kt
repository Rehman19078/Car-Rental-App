import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.carrentalapp.R
import com.example.carrentalapp.app.component.CustomHeadingTwo
import com.example.carrentalapp.app.component.CustomImage
import com.example.carrentalapp.app.component.FontStyle

@Composable
fun CustomButtonWithIcon(
    text: String,
    onClick: () -> Unit,
    backgroundColor: Color = Color(0xFFFFFFFF),
    textColor: Color = Color(0xFF252525),
    cornerRadius: Dp = 5.dp,
    modifier: Modifier = Modifier,
    font: FontStyle = FontStyle.LIGHT,
    leadingImage: Painter = painterResource(id = R.drawable.google), // Custom image painter
) {
    val fontFamily = when (font) {
        FontStyle.REGULAR -> FontFamily(Font(R.font.regular))
        FontStyle.BOLD -> FontFamily(Font(R.font.bold))
        FontStyle.MEDIUM -> FontFamily(Font(R.font.medium))
        FontStyle.LIGHT -> FontFamily(Font(R.font.light))
    }

    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = backgroundColor,
            contentColor = textColor
        ),
        shape = RoundedCornerShape(cornerRadius),
        modifier = modifier
            .height(55.dp)
            .fillMaxWidth()
    ) {
        // Box to align the image and text properly
        Box(
            contentAlignment = Alignment.Center
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier.fillMaxWidth()
            ) {
                CustomImage(painter = leadingImage, contentDescription = "Leading Image",modifier = Modifier.size(24.dp))
                Text(
                    text = text,
                    style = TextStyle(
                        color = textColor,
                        fontFamily = fontFamily,
                        fontSize = 14.sp
                    ),
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}
