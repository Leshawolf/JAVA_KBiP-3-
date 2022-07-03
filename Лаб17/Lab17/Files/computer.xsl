<xsl:stylesheet
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    version="1.0">
    <xsl:template match="device">
        <html>
            <head>
                <title>Notepad Contents</title>
            </head>

            <body style="background-color: red;"> <table border="1">
                <tr>
                    <th>Name</th>
                    <th>Origin</th>
                    <th>Price</th>
                    <th>Type</th>
                    <th>Socket</th>
                </tr>
                <xsl:for-each select="unit">
                    <tr>
                        <td><xsl:value-of select="@name"/></td>
                        <td><xsl:value-of select="origin"/></td>
                        <td><xsl:value-of select="price"/></td>
                        <td><xsl:value-of select="type"/></td>
                        <td><xsl:value-of select="socket"/></td>
                    </tr>
                </xsl:for-each>
            </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
