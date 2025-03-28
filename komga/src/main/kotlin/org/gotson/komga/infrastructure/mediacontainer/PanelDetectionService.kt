package org.gotson.komga.infrastructure.mediacontainer

import org.gotson.komga.domain.model.Panel
import org.springframework.stereotype.Service
import java.io.File
import javax.imageio.ImageIO

@Service
class PanelDetectionService {
  fun detectPanels(imageFile: File): List<Panel> {
    val image = ImageIO.read(imageFile)
    val width = image.width
    val height = image.height

    // TEMP: two dummy panels left/right
    return listOf(
      Panel(x = 0, y = 0, width = width / 2, height = height, order = 0),
      Panel(x = width / 2, y = 0, width = width / 2, height = height, order = 1),
    )
  }
}
