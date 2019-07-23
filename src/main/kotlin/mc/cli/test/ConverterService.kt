package mc.cli.test

import io.micronaut.context.annotation.Primary
import javax.inject.Singleton

@Singleton
public class ConverterService {
    internal fun service() = "test"
}
