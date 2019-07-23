package mc.cli.test

import io.micronaut.configuration.picocli.PicocliRunner
import io.micronaut.context.ApplicationContext

import picocli.CommandLine
import picocli.CommandLine.Command
import picocli.CommandLine.Option
import picocli.CommandLine.Parameters
import javax.inject.Inject

@Command(name = "mc-cli-test", description = ["..."],
        mixinStandardHelpOptions = true)
class McCliTestCommand : Runnable {
    @Inject
    val converterService: ConverterService? = null
    @Option(names = ["-v", "--verbose"], description = ["..."])
    private var verbose : Boolean = false

    override fun run() {
        println("Hi! $converterService")
    }

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            PicocliRunner.run(McCliTestCommand::class.java, *args)
        }
    }
}
