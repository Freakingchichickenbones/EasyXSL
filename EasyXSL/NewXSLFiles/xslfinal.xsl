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

javax.swing.JTextField[,114,174,168x43,layout=javax.swing.plaf.basic.BasicTextUI$UpdateHandler,alignmentX=0.0,alignmentY=0.0,border=javax.swing.plaf.BorderUIResource$CompoundBorderUIResource@67217753,flags=296,maximumSize=,minimumSize=,preferredSize=,caretColor=sun.swing.PrintColorUIResource[r=51,g=51,b=51],disabledTextColor=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],editable=true,margin=javax.swing.plaf.InsetsUIResource[top=0,left=0,bottom=0,right=0],selectedTextColor=sun.swing.PrintColorUIResource[r=51,g=51,b=51],selectionColor=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],columns=10,columnWidth=0,command=,horizontalAlignment=LEADING]    

  </xsl:copy>

 </xsl:template>
</xsl:transform>