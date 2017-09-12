<xsl:transform version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

 <!-- Copy everything not matched by another rule -->
 <xsl:template match="* | comment()">
  <xsl:copy>
   <xsl:copy-of select="@*"/>
   <xsl:apply-templates/>
  </xsl:copy>
 </xsl:template>

 <!-- Append our strings to the end -->
 <xsl:template match=>
  <xsl:copy>
   <xsl:copy-of select="@*"/>
   <xsl:apply-templates/>

    

  </xsl:copy>

 </xsl:template>
</xsl:transform>